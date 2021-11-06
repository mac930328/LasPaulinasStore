package com.mac.productsStore.repositories;

import com.mac.productsStore.models.OrderByProduct;
import com.mac.productsStore.repositories.interfaces.OrderByProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderByProductRepository {

    @Autowired
    private OrderByProductInterface interfaceModel;

    public List<OrderByProduct> getAll() {
        return (List<OrderByProduct>) interfaceModel.findAll();
    }

    public Optional<OrderByProduct> getById(Integer id) {
        return interfaceModel.findById(id);
    }

    public OrderByProduct createOrUpdate(OrderByProduct object) {
        return interfaceModel.save(object);
    }

    public void delete(Integer id) {
        interfaceModel.deleteById(id);
    }
}
