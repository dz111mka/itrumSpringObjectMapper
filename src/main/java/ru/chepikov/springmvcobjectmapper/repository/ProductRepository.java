package ru.chepikov.springmvcobjectmapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chepikov.springmvcobjectmapper.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
