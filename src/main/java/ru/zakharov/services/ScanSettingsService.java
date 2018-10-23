package ru.zakharov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zakharov.entities.ScanSettings;
import ru.zakharov.repositories.ScanSettingsRepository;

import java.util.List;

@Service
public class ScanSettingsService {
    private ScanSettingsRepository scanSettingsRepository;

    @Autowired
    public void setScanSettingsRepository(ScanSettingsRepository scanSettingsRepository) {
        this.scanSettingsRepository = scanSettingsRepository;
    }

    public List<ScanSettings> showAllScanSettings() {
        return scanSettingsRepository.findAll();
    }

    public void addScanSettings(ScanSettings scanSettings) {
        if (scanSettings == null) return;
        scanSettingsRepository.save(scanSettings);
    }

    public void removeScanSettings(int id) {
        scanSettingsRepository.deleteById((long) id);
    }

    public ScanSettings findScanSettingsById(Long scanSettingsId) {
        return scanSettingsRepository.findScanSettingsById(scanSettingsId);
    }

    public void save(ScanSettings scanSettings) {
        if (scanSettings == null) return;
        scanSettingsRepository.save(scanSettings);
    }

}
