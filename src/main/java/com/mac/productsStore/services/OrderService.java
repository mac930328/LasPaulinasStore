package com.mac.productsStore.services;

import com.mac.productsStore.models.Order;
import com.mac.productsStore.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> getAll() {
        return repository.getAll();
    }

    public Optional<Order> getById(Integer id) {
        return repository.getById(id);
    }

    public Order create(Order object) {
        if (object.getId() == null) {
            return repository.createOrUpdate(object);
        } else {
            Optional<Order> c = repository.getById(object.getId());
            if (c.isEmpty()) {
                return repository.createOrUpdate(object);
            } else {
                return object;
            }
        }
    }

    public Order update(Order object) {
        if (object.getId() != null) {
            Optional<Order> c = repository.getById(object.getId());
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
