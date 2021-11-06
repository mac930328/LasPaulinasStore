package com.mac.productsStore.repositories.interfaces;

import com.mac.productsStore.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductInterface extends CrudRepository<Product, Integer> {
}
