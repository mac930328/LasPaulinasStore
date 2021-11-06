package com.mac.productsStore.controllers;

import com.mac.productsStore.models.Product;
import com.mac.productsStore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Product")
//@CrossOrigin(origins = "*")
public class ProductApiRest {

    @Autowired
    private ProductService service;

    @GetMapping("/all")
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product object) {
        return service.create(object);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Product update(@RequestBody Product object) {
        return service.update(object);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return service.delete(id);
    }
}
