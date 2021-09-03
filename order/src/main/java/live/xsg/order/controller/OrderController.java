package live.xsg.order.controller;

import live.xsg.order.entity.Order;
import live.xsg.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/create_order")
    public Map createOrder(Integer orderId, Integer memberId, Integer goodsId, Integer quantity) {
        Map<String, String> result = new HashMap<>();
        orderService.createOrder(orderId, memberId, goodsId, quantity);
        result.put("code", "0");
        result.put("message", "create order success");
        return result;
    }
}