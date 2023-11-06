package com.rohith.customer.dal.repos;

import com.rohith.customer.dal.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
