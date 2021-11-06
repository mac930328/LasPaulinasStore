package com.mac.productsStore.repositories.interfaces;

import com.mac.productsStore.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderInterface extends CrudRepository<Order, Integer> {
}
