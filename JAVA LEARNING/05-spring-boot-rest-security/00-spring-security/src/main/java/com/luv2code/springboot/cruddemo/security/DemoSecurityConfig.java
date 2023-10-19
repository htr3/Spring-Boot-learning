package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

   // add support for JDBC .. no more hardcode user

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {

        return new JdbcUserDetailsManager(dataSource);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
                );

        // use HTTP Basic authorization
        http.httpBasic(Customizer.withDefaults());

        // disable Cross Size Request forhery (CSRF)
        // in general, not required for stateless REST APIs that use POST, PUT, DELETE and/or  PATCH

        http.csrf(csrf-> csrf.disable());
        return http.build();
    }


        /*
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails vishal = User.builder()
                .username("virus")
                .password("{noop}virus115")
                .roles("EMPLOYEE")
                .build();

        UserDetails naruto = User.builder()
                .username("naruto")
                .password("{noop}naruto115")
                .roles("EMPLOYEE", "MANAGER")
                .build();
        UserDetails hinata = User.builder()
                .username("hinata")
                .password("{noop}hinata115")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

            return new InMemoryUserDetailsManager(vishal, naruto, hinata);
    }


*/



}