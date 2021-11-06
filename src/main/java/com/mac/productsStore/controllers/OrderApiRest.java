package com.mac.productsStore.controllers;

import com.mac.productsStore.models.Order;
import com.mac.productsStore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Order")
//@CrossOrigin(origins = "*")
public class OrderApiRest {

    @Autowired
    private OrderService service;

    @GetMapping("/all")
    public List<Order> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order object) {
        return service.create(object);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Order update(@RequestBody Order object) {
        return service.update(object);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return service.delete(id);
    }
}
