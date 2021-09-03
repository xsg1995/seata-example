package live.xsg.mall.service;

import io.seata.spring.annotation.GlobalTransactional;
import live.xsg.mall.client.OrderFeignClient;
import live.xsg.mall.client.StorageFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xsg on 2021/9/3.
 */
@Service
public class MallService {

    @Autowired
    private OrderFeignClient orderFeignClient;
    @Autowired
    private StorageFeignClient storageFeignClient;

    @GlobalTransactional(name = "seate-group-tx-mall", rollbackFor = {Exception.class})
    public String sale(Integer orderId, Integer memberId, Integer goodsId, Integer quantity) {
        this.orderFeignClient.createOrder(orderId, memberId, goodsId, quantity);
        this.storageFeignClient.createOrder(goodsId, quantity);

        return "success";
    }
}
