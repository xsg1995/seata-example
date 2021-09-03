package live.xsg.mall.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by xsg on 2021/9/3.
 */
@FeignClient("storage")
public interface StorageFeignClient {

    @GetMapping("/reduce_storage")
    Map<String, String> createOrder(@RequestParam("goodsId") Integer goodsId,
                                    @RequestParam("quantity") Integer quantity);
}
