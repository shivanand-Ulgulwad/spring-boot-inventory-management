package com.app.runner;

import com.app.model.Product;
import com.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InventoryApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;



    @Override
    public void run(String... args) {

        // Add Products
        productService.addProduct(new Product(null, "Laptop", 10, 65000));
        productService.addProduct(new Product(null, "Keyboard", 3, 1200));
        productService.addProduct(new Product(null, "Mouse", 2, 800));

        System.out.println("\nAll Products:\n");
        productService.getAllProducts().forEach(System.out::println);
        System.out.println("\nLow Stock Products:\n");
        productService.getLowStockProducts().forEach(System.out::println);
    }
}