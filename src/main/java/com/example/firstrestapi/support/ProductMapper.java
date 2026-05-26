package com.example.firstrestapi.support;

import com.example.firstrestapi.api.request.ProductRequest;
import com.example.firstrestapi.api.response.ProductResponse;
import com.example.firstrestapi.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {

        Product product = new Product();
        product.setName(productRequest.getName());

        return product;
    }

    public ProductResponse toProductResponse(Product product) {

        ProductResponse response = new ProductResponse();

        response.setId(product.getId());
        response.setName(product.getName());

        return response;
    }
    public ProductResponse toProductResponse(
            Long id,
            String name) {

        ProductResponse response = new ProductResponse();

        response.setId(id);
        response.setName(name);

        return response;
    }
}