package org.example.jpabook.week09_jpa_project.dto;

import org.example.jpabook.week09_jpa_project.entity.Product;

public record ProductResponse(
        Long id,
        String name,
        Integer price,
        String category,
        Integer stock,
        String description
) {
    public static ProductResponse from(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getCategory(),
                product.getStock(),
                product.getDescription()
        );
    }
}
