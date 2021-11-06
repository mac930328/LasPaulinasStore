package com.mac.productsStore.repositories;

import com.mac.productsStore.models.Client;
import com.mac.productsStore.repositories.interfaces.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientInterface interfaceModel;

    public List<Client> getAll(){
        return (List<Client>) interfaceModel.findAll();
    }

    public Optional<Client> getById(Long id){
        return interfaceModel.findById(id);
    }

    public Client createOrUpdate(Client object){
        return interfaceModel.save(object);
    }

    public void delete(Long id){
        interfaceModel.deleteById(id);
    }
}
