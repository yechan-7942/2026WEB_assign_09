package org.example.jpabook.week09_jpa_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(length = 50)
    private String category;

    @Column(nullable = false)
    private Integer stock;

    @Column(length = 1000)
    private String description;

    protected Product() {
    }

    public Product(String name, Integer price, String category, Integer stock, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.description = description;
    }

    public void update(String name, Integer price, String category, Integer stock, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Integer getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }
}
