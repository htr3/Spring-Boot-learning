package com.virus.shoppingkart.OnlineShop.repository;

import com.couchbase.client.core.deps.com.google.common.base.Optional;
import com.virus.shoppingkart.OnlineShop.model.Customer;
import com.virus.shoppingkart.OnlineShop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Qualifier("CustomerRepositoryService")
public class CustomerRepositoryService implements CustomerService {

//    @Autowired
    private CustomerService repo;

    public Optional<Customer> findOne(String id) {
        return repo.findById(id);
    }

    public List<Customer> findAll() {
        List<Customer> people = new ArrayList<Customer>();
        Iterator<Customer> it = repo.findAll().iterator();
        while(it.hasNext()) {
            people.add(it.next());
        }
        return people;
    }

    public List<Customer> findByFirstName(String firstName) {
        return repo.findByFirstName(firstName);
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        return null;
    }

    public void create(Customer person) {
//        person.setCreated(DateTime.now());
        repo.save(person);
    }

    public void update(Customer person) {
//        person.setUpdated(DateTime.now());
        repo.save(person);
    }

    public void delete(Customer person) {
        repo.delete(person);
    }

    @Override
    public void save(Customer customer) {
        repo.save(customer);
    }

    @Override
    public Optional<Customer> findById(String id) {
        return repo.findById(id);
    }
}
