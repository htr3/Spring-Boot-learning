package com.virus.shoppingkart.OnlineShop.model;

import com.couchbase.client.core.deps.com.google.type.DateTime;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Document
public class Customer {
//    @Id
//    private String id;

    @Field
    @NotNull
    private String firstName;

    @Field
    @NotNull
    private String lastName;


    @Id
    private String mobileNumber;


    @Field
    private String email;

    @Field
    @NotNull
    private String password;


//    @Field
//    @NotNull
//    private DateTime created;
//
//    @Field
//    private DateTime updated;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

// standard getters and setters
}