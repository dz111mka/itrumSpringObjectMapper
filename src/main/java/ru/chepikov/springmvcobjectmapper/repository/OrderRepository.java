package ru.chepikov.springmvcobjectmapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chepikov.springmvcobjectmapper.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
