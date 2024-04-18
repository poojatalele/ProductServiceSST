package com.sst.productservicesst.controllers;

import com.sst.productservicesst.dtos.ExceptionDto;
import com.sst.productservicesst.dtos.FakeStoreProductDto;
import com.sst.productservicesst.models.Product;
import com.sst.productservicesst.services.FakeStoreProductService;
import com.sst.productservicesst.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//this controller is capable to host HTTP API's
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
//        throw new RuntimeException("Something went wrong");

//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try{
//            productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("Hello");
//            return responseEntity;
//        }
//        catch (RuntimeException exception) {
//            ExceptionDto dto = new ExceptionDto();
//            dto.setMessage("Something went wrong!");
//            ResponseEntity<ExceptionDto> response =
//                    new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
////            System.out.println("Something went wrong");
//            return response;
//        }
        //product.setImage("sample image");

//        Product product1 = new Product();
//        product1.setTitle("Macbook");
//        return product1;
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
