package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    int id;
    String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @NotNull
    @Column(name="NAME", unique=true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
