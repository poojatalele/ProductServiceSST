package com.sst.productservicesst.controllers;

import com.sst.productservicesst.models.Product;
import com.sst.productservicesst.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
    @Autowired
    private ProductController productController;

    @MockBean
    private ProductService productService;

    @Test
    void getProductById() {
        //Sample Product
        Product product = new Product(); // @1234
        product.setId(1L);
        product.setTitle("iphone 15");
        product.setPrice(100000.0);
        //Mock the product service call.
        when(productService.getProductById(1L))
                .thenReturn(product);

        System.out.println(product.getImage()); //NULL

        Product outputProduct = productController.getProductById(1L);

        System.out.println(product.getImage());
        System.out.println(outputProduct.getImage());

        assertEquals(product, outputProduct);
    }

    @Test
    void getAllProducts() {
    }

    @Test
    void createProduct() {
    }
}