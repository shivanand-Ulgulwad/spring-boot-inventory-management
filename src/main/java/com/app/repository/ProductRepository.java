package com.app.repository;


import com.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Custom Query
    @Query("SELECT p FROM Product p WHERE p.quantity < 5")
    List<Product> findLowStockProducts();
}
