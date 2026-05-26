package com.example.firstrestapi.support;

import com.example.firstrestapi.support.exception.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> productNotFound() {
        return ProductNotFoundException::new;
    }
}