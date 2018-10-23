package ru.zakharov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zakharov.entities.Target;
import ru.zakharov.repositories.TargetRepository;

import java.util.List;

@Service
public class TargetService {
    private TargetRepository targetRepository;

    @Autowired
    public void setTargetRepository(TargetRepository targetRepository) {
        this.targetRepository = targetRepository;
    }

    public List<Target> showAllTargets() {
        return targetRepository.findAll();
    }

    public void addTarget(Target target) {
        if (target == null) return;
        targetRepository.save(target);
    }

    public Target findTargetById(Long targetId) {
        return targetRepository.findTargetById(targetId);
    }

    public void removeTarget(int id) {
        targetRepository.deleteById((long) id);
    }

}

