package com.mac.productsStore.services;

import com.mac.productsStore.models.Client;
import com.mac.productsStore.models.Product;
import com.mac.productsStore.repositories.ClientRepository;
import com.mac.productsStore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Optional<Product> getById(Integer id) {
        return repository.getById(id);
    }

    public Product create(Product object) {
        if (object.getId() == null) {
            return repository.createOrUpdate(object);
        } else {
            Optional<Product> c = repository.getById(object.getId());
            if (c.isEmpty()) {
                return repository.createOrUpdate(object);
            } else {
                return object;
            }
        }
    }

    public Product update(Product object) {
        if (object.getId() != null) {
            Optional<Product> c = repository.getById(object.getId());
            if (!c.isEmpty()) {
                return repository.createOrUpdate(object);
            } else {
                return object;
            }
        } else {
            return object;
        }
    }

    public boolean delete(Integer id) {
        return getById(id).map(client -> {
            repository.delete(client.getId());
            return true;
        }).orElse(false);
    }
}
