package com.sst.productservicesst;

import com.sst.productservicesst.models.Category;
import com.sst.productservicesst.models.Product;
import com.sst.productservicesst.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductServiceSStApplicationTests {
    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    void contextLoads() {
    }
//    @Test
//    void testEagerVsLazyFetch() {
//        Optional<Category> optionalCategory =
//                categoryRepository.findById(1L);
//
//        Category category = optionalCategory.get();
//
//        System.out.println("Fetching list of products for the above category");
//        List<Product> products = category.getProducts();
//
//        System.out.println("DEBUG");
//    }
}
