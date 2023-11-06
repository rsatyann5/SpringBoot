package com.rohith.customer.dal;

import com.rohith.customer.dal.entities.Customer;
import com.rohith.customer.dal.repos.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository repo;


	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Rohith");
		customer.setEmail("rohithspr@gmail.com");
		repo.save(customer);
	}

	@Test
	void testFindCustomerById(){
		Customer customer = repo.findById(1l).get();
		System.out.println(customer);
	}

	@Test
	void testUpdateCustomer(){
		Customer customer = repo.findById(1l).get();
		customer.setEmail("rohith@gmail.com");
		repo.save(customer);
	}

	@Test
	void testDeleteCustomer(){
		Customer customer = repo.findById(1l).get();
		repo.delete(customer);

	}

}
