package com.example.customerfrontthymleafapp;

import com.example.customerfrontthymleafapp.entities.Customer;
import com.example.customerfrontthymleafapp.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Mohammed").email("mohamed@gmail.com").build());
            customerRepository.save(Customer.builder().name("omar").email("omar@gmail.com").build());
            customerRepository.save(Customer.builder().name("Asmaa").email("asmaa@gmail.com").build());
        };
    }
}
