package com.mac.productsStore.repositories.interfaces;

import com.mac.productsStore.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientInterface extends CrudRepository<Client, Long> {
}
