package com.uniajc.sergio.apirestfultest.utils;

import com.uniajc.sergio.apirestfultest.enums.Status;
import com.uniajc.sergio.apirestfultest.models.Employee;
import com.uniajc.sergio.apirestfultest.models.Order;
import com.uniajc.sergio.apirestfultest.repositories.EmployeeRepository;
import com.uniajc.sergio.apirestfultest.repositories.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository empRepository, OrderRepository orderRepository) {

        orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
        orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

        orderRepository.findAll().forEach(order -> {
            log.info("Preloaded " + order);
        });

        return args -> {
            log.info("Preloading " + empRepository.save(new Employee("Bilbo", "Baggins", "burglar")));
            log.info("Preloading " + empRepository.save(new Employee("Frodo", "Baggins", "thief")));            
        };
    }
}