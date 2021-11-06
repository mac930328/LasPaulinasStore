package com.mac.productsStore.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private Double amount;

    /*@OneToMany(mappedBy = "product", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"order", "product"})
    private List<OrderByProduct> orderByProductList;*/
}
