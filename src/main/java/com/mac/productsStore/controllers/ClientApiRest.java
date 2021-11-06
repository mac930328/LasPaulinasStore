package com.mac.productsStore.controllers;

import com.mac.productsStore.models.Client;
import com.mac.productsStore.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
//@CrossOrigin(origins = "*")
public class ClientApiRest {

    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody Client object) {
        return service.create(object);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Client update(@RequestBody Client object) {
        return service.update(object);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
