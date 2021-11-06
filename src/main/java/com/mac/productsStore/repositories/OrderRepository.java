package com.mac.productsStore.repositories;

import com.mac.productsStore.models.Order;
import com.mac.productsStore.models.Product;
import com.mac.productsStore.repositories.interfaces.OrderInterface;
import com.mac.productsStore.repositories.interfaces.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository {

    @Autowired
    private OrderInterface interfaceModel;

    public List<Order> getAll(){
        return (List<Order>) interfaceModel.findAll();
    }

    public Optional<Order> getById(Integer id){
        return interfaceModel.findById(id);
    }

    public Order createOrUpdate(Order object){
        return interfaceModel.save(object);
    }

    public void delete(Integer id){
        interfaceModel.deleteById(id);
    }
}
