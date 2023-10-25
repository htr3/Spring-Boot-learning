package com.virus.shoppingkart.OnlineShop.controller;

import com.virus.shoppingkart.OnlineShop.model.Customer;
import com.virus.shoppingkart.OnlineShop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/hello")
    public String print() {
        return "this is for test";
    }


    // find by id
    @GetMapping("/findById")
    public List<Customer> findById(@Param("Id") String Id) {
        return customerRepository.findByFirstName(Id);
    }

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    // save Customer
    @PostMapping("/save")
    public String save(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Custmer save successfully " ;
    }


//    delete all
    @DeleteMapping("/delete")
    public String deleteAll() {
        customerRepository.deleteAll();
        return "All Customer deleted ";
    }


    // delete by Id
   @DeleteMapping("/deleteId")
    public String delete(@RequestParam("id") String id) {
       customerRepository.deleteById(id);
        return "id deleted successfull ! ";
   }

}
