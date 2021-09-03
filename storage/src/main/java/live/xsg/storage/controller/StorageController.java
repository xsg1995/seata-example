package live.xsg.storage.controller;

import live.xsg.storage.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @GetMapping("/reduce_storage")
    public Map<String, String> createOrder(Integer goodsId, Integer quantity) {
        Map<String, String> result = new HashMap<>();
        storageService.reductStorage(goodsId, quantity);
        result.put("code", "0");
        result.put("message", "create order success");
        return result;
    }
}