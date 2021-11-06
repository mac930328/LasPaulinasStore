package com.mac.productsStore.services;

import com.mac.productsStore.models.OrderByProduct;
import com.mac.productsStore.repositories.OrderByProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderByProductService {

    @Autowired
    private OrderByProductRepository repository;

    public List<OrderByProduct> getAll() {
        return repository.getAll();
    }

    public Optional<OrderByProduct> getById(Integer id) {
        return repository.getById(id);
    }

    public OrderByProduct create(OrderByProduct object) {
        if (object.getId() == null) {
            return repository.createOrUpdate(object);
        } else {
            Optional<OrderByProduct> c = repository.getById(object.getId());
            if (c.isEmpty()) {
                return repository.createOrUpdate(object);
            } else {
                return object;
            }
        }
    }

    public OrderByProduct update(OrderByProduct object) {
        if (object.getId() != null) {
            Optional<OrderByProduct> c = repository.getById(object.getId());
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
