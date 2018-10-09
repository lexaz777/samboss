package ru.zakharov.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.zakharov.entities.Port;

import java.util.List;

@Repository
public interface PortRepository extends CrudRepository<Port, Long> {
    public List<Port> findAllPortsByScanId(Long scanId);
}
