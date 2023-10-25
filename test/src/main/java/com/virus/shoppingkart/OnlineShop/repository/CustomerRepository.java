package com.virus.shoppingkart.OnlineShop.repository;

import com.couchbase.client.core.deps.com.google.common.base.Optional;
import com.virus.shoppingkart.OnlineShop.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {
    List<Customer> findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);





}