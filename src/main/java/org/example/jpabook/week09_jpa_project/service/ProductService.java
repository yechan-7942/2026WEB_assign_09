package org.example.jpabook.week09_jpa_project.service;

import org.example.jpabook.week09_jpa_project.dto.ProductRequest;
import org.example.jpabook.week09_jpa_project.dto.ProductResponse;
import org.example.jpabook.week09_jpa_project.entity.Product;
import org.example.jpabook.week09_jpa_project.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public ProductResponse create(ProductRequest request) {
        Product product = new Product(
                request.name(),
                request.price(),
                request.category(),
                request.stock(),
                request.description()
        );
        return ProductResponse.from(productRepository.save(product));
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(ProductResponse::from)
                .toList();
    }

    public ProductResponse findById(Long id) {
        return ProductResponse.from(findProduct(id));
    }

    @Transactional
    public ProductResponse update(Long id, ProductRequest request) {
        Product product = findProduct(id);
        product.update(
                request.name(),
                request.price(),
                request.category(),
                request.stock(),
                request.description()
        );
        return ProductResponse.from(productRepository.save(product));
    }

    @Transactional
    public void delete(Long id) {
        findProduct(id);
        productRepository.deleteById(id);
    }

    private Product findProduct(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "상품을 찾을 수 없습니다: " + id
                ));
    }
}
