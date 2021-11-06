package com.mac.productsStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.mac.productsStore.models"})
public class ProductsStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsStoreApplication.class, args);
    }

}
