package com.virus.shoppingkart.OnlineShop.service;

import com.couchbase.client.core.deps.com.google.common.base.Optional;
import com.virus.shoppingkart.OnlineShop.model.Customer;

import java.util.List;

public interface CustomerService {
    Optional<Customer> findOne(String id);
    List<Customer> findAll();
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
    void create(Customer person);
    void update(Customer person);
    void delete(Customer person);
    void save(Customer customer);

    Optional<Customer> findById(String id);

}