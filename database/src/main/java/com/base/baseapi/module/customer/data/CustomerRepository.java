package com.base.baseapi.module.customer.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer save(Customer customer);
    Optional<Customer> findById(Long id);
}
