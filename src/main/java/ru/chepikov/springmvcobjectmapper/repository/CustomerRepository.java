package ru.chepikov.springmvcobjectmapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chepikov.springmvcobjectmapper.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
