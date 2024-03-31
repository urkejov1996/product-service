package com.urkejov.productservice.product;

import com.urkejov.productservice.dto.ProductRequest;

import java.math.BigDecimal;

public class tools {



    protected static ProductRequest getProductRequest() {
        return ProductRequest.builder()
                .name("iPhone 15")
                .description("iPhone 15")
                .price(BigDecimal.valueOf(1500))
                .build();
    }
}
