package com.mac.productsStore.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date orderDate;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    /*@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "order")
    @JsonIgnoreProperties({"order","product"})
    private List<OrderByProduct> orderByProductList;*/
}
