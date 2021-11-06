package com.mac.productsStore.repositories;

import com.mac.productsStore.models.Client;
import com.mac.productsStore.models.Product;
import com.mac.productsStore.repositories.interfaces.ClientInterface;
import com.mac.productsStore.repositories.interfaces.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    @Autowired
    private ProductInterface interfaceModel;

    public List<Product> getAll(){
        return (List<Product>) interfaceModel.findAll();
    }

    public Optional<Product> getById(Integer id){
        return interfaceModel.findById(id);
    }

    public Product createOrUpdate(Product object){
        return interfaceModel.save(object);
    }

    public void delete(Integer id){
        interfaceModel.deleteById(id);
    }
}
