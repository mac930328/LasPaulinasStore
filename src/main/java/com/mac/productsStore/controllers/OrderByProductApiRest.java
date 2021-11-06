package com.mac.productsStore.controllers;

import com.mac.productsStore.models.OrderByProduct;
import com.mac.productsStore.services.OrderByProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/OrderByProduct")
//@CrossOrigin(origins = "*")
public class OrderByProductApiRest {

    @Autowired
    private OrderByProductService service;

    @GetMapping("/all")
    public List<OrderByProduct> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<OrderByProduct> getById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderByProduct create(@RequestBody OrderByProduct object) {
        return service.create(object);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderByProduct update(@RequestBody OrderByProduct object) {
        return service.update(object);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return service.delete(id);
    }
}
