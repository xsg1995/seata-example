package live.xsg.mall.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by xsg on 2021/9/3.
 */
@FeignClient("order")
public interface OrderFeignClient {

    @GetMapping("create_order")
    Map<String, String> createOrder(@RequestParam("orderId") Integer orderId,
                                    @RequestParam("memberId") Integer memberId,
                                    @RequestParam("goodsId") Integer goodsId,
                                    @RequestParam("quantity") Integer quantity);
}
