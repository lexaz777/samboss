package ru.zakharov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zakharov.entities.NetworkObject;
import ru.zakharov.repositories.NetworkObjectRepository;
import java.util.List;

@Service
public class NetworkObjectService {
    private NetworkObjectRepository networkObjectRepository;

    @Autowired
    public void setNetworkObjectRepository(NetworkObjectRepository networkObjectRepository) {
        this.networkObjectRepository = networkObjectRepository;
    }

    public NetworkObjectService() {
    }

    public List<NetworkObject> getAllNetworkObjects() {
        return (List<NetworkObject>) networkObjectRepository.findAll();
    }
}
