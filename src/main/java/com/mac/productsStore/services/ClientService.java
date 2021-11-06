package com.mac.productsStore.services;

import com.mac.productsStore.models.Client;
import com.mac.productsStore.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> getAll() {
        return repository.getAll();
    }

    public Optional<Client> getById(Long id) {
        return repository.getById(id);
    }

    public Client create(Client client) {
        if (client.getId() == null) {
            return repository.createOrUpdate(client);
        } else {
            Optional<Client> c = repository.getById(client.getId());
            if (c.isEmpty()) {
                return repository.createOrUpdate(client);
            } else {
                return client;
            }
        }
    }

    public Client update(Client client) {
        if (client.getId() != null) {
            Optional<Client> c = repository.getById(client.getId());
            if (!c.isEmpty()) {
                return repository.createOrUpdate(client);
            } else {
                return client;
            }
        } else {
            return client;
        }
    }

    public boolean delete(Long id) {
        return getById(id).map(client -> {
            repository.delete(client.getId());
            return true;
        }).orElse(false);
    }
}
