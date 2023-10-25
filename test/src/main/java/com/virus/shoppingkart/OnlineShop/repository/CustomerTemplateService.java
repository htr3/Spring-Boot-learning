package com.virus.shoppingkart.OnlineShop.repository;

import com.couchbase.client.core.deps.com.google.common.base.Optional;
import com.virus.shoppingkart.OnlineShop.model.Customer;
import com.virus.shoppingkart.OnlineShop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.couchbase.core.query.QueryCriteria.where;

@Service
@Qualifier("CustomerTemplateService")
public class CustomerTemplateService implements CustomerService {

    private static final String DESIGN_DOC = "person";

    private CouchbaseTemplate template;

    @Autowired
    public void setCouchbaseTemplate(CouchbaseTemplate template) {
        this.template = template;
    }

    public Optional<Customer> findOne(String id) {
        return Optional.of(template.findById(Customer.class).one(id));
    }

    public List<Customer> findAll() {
        return template.findByQuery(Customer.class).all();
    }

    public List<Customer> findByFirstName(String firstName) {
        return template.findByQuery(Customer.class).matching(where("firstName").is(firstName)).all();
    }

    public List<Customer> findByLastName(String lastName) {
        return template.findByQuery(Customer.class).matching(where("lastName").is(lastName)).all();
    }

    public void create(Customer person) {
//        person.setId(DateTime.now());
        template.insertById(Customer.class).one(person);
    }

    public void update(Customer person) {
//        person.setUpdated(DateTime.now());
        template.removeById(Customer.class).oneEntity(person);
    }

    public void delete(Customer person) {
        template.removeById(Customer.class).oneEntity(person);
    }

    @Override
    public void save(Customer customer) {
        template.save(customer);
    }

    @Override
    public Optional<Customer> findById(String id) {
//        return template.findById(id);
        return null;
    }
}