package ru.zakharov.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.zakharov.entities.Target;

import java.util.List;

@Repository
public interface TargetRepository extends CrudRepository<Target,Long> {
    public List<Target> findAll();
    public Target findTargetById(Long targetId);
}
