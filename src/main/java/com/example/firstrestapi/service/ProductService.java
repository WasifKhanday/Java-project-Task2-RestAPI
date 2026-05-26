package com.example.firstrestapi.service;

import com.example.firstrestapi.api.request.ProductRequest;
import com.example.firstrestapi.api.request.UpdateProductRequest;
import com.example.firstrestapi.api.response.ProductResponse;
import com.example.firstrestapi.domain.Product;
import com.example.firstrestapi.repository.ProductRepository;
import com.example.firstrestapi.support.ProductExceptionSupplier;
import com.example.firstrestapi.support.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository,
                          ProductMapper productMapper) {

        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {

        Product product = productMapper.toProduct(productRequest);

        Product savedProduct = productRepository.save(product);

        return productMapper.toProductResponse(savedProduct);
    }

    public ProductResponse find(Long id) {

        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound());

        return productMapper.toProductResponse(product);
    }

    public ProductResponse update(
            Long id,
            UpdateProductRequest request) {

        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound());

        ProductResponse previousState =
                productMapper.toProductResponse(
                        product.getId(),
                        product.getName());

        product.setName(request.getName());

        productRepository.save(product);

        return previousState;
    }

    public List<ProductResponse> findAll() {

        return productRepository.findAll()
                .stream()
                .map(productMapper::toProductResponse)
                .collect(Collectors.toList());
    }

    public void delete(Long id) {

        productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound());

        productRepository.deleteById(id);
    }
}