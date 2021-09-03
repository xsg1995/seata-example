package live.xsg.storage.repository;

import live.xsg.storage.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<Storage, Integer> {
}