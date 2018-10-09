package ru.zakharov.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.zakharov.entities.NetworkObject;

@Repository
public interface NetworkObjectRepository extends CrudRepository<NetworkObject, Long> {
}
