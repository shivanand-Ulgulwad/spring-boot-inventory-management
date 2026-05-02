# Spring Boot Inventory Management System

A console-based Inventory Management System built using Spring Boot and Spring Data JPA.

## Features

* Add Products
* View All Products
* Detect Low Stock Products
* Custom JPQL Query
* MySQL Database Integration
* Layered Architecture

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

## Project Structure

```text
src
 ┣ entity
 ┣ repository
 ┣ service
 ┗ main
```

## Custom Query Used

```java
@Query("SELECT p FROM Product p WHERE p.quantity < 5")
List<Product> findLowStockProducts();
```

## Learning Outcome

This project helped me understand:

* Entity Mapping
* Repository Pattern
* Spring Data JPA
* JPQL Queries
* Database Integration
* Real-world backend architecture

## Author

Shivanand Ulgulwad
