package live.xsg.storage.service;

import live.xsg.storage.entity.Storage;
import live.xsg.storage.repository.StorageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StorageService {
    @Resource
    private StorageRepository storageRepository;

    @Transactional
    public Storage reductStorage(Integer goodsId, Integer quantity) {
        Storage storage = this.storageRepository.findById(goodsId).get();
        if (storage.getQuantity() < quantity) {
            throw new IllegalArgumentException(String.format("%d 商品库存不足"));
        }
        storage.setQuantity(storage.getQuantity() - quantity);
        return storageRepository.save(storage);
    }
}