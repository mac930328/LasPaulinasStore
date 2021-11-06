package com.mac.productsStore.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    private Long id;
    private String name;
    private String lasName;
    private Long phone;
    private String email;
    private String address;

    /*@OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("client")
    private List<Order> orderList;*/
}
