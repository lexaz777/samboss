package ru.zakharov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zakharov.entities.Scan;
import ru.zakharov.repositories.ScanRepository;

import java.util.List;

@Service
public class ScanService {
    private ScanRepository scanRepository;

    @Autowired
    public void setScanRepository(ScanRepository scanRepository) {
        this.scanRepository = scanRepository;
    }

    public List<Scan> getAllScansByHostId(Long id) {
        return scanRepository.findAllScansByNetworkObjectId(id);
    }

    public List<Scan> getAllScans() {
        return (List<Scan>) scanRepository.findAll();
    }
}
