package com.sst.productservicesst;

import com.sst.productservicesst.models.Category;
import com.sst.productservicesst.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ProductServiceSStApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProductServiceSStApplication.class, args);

    }

}
