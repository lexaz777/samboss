package ru.zakharov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zakharov.entities.Port;
import ru.zakharov.repositories.PortRepository;

import java.util.List;

@Service
public class PortService {
    private PortRepository portRepository;

    @Autowired
    public void setPortRepository(PortRepository portRepository) {
        this.portRepository = portRepository;
    }

    public List<Port> listAllPortsByScanId(Long scanId) {
        return portRepository.findAllPortsByScanId(scanId);
    }
}
