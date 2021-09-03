package live.xsg.mall.controller;

import live.xsg.mall.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MallController {
    @Autowired
    private MallService mallService;

    @GetMapping("/sale")
    public String sale(Integer orderId, Integer memberId, Integer goodsId, Integer quantity) {
        return mallService.sale(orderId, memberId, goodsId, quantity);
    }
}