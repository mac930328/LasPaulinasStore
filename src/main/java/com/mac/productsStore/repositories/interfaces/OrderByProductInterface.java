package com.mac.productsStore.repositories.interfaces;

import com.mac.productsStore.models.OrderByProduct;
import org.springframework.data.repository.CrudRepository;

public interface OrderByProductInterface extends CrudRepository<OrderByProduct, Integer> {
}
