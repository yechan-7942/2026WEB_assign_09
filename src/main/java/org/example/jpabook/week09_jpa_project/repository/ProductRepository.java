package org.example.jpabook.week09_jpa_project.repository;

import org.example.jpabook.week09_jpa_project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
