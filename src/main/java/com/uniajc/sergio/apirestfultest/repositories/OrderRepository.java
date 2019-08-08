package com.uniajc.sergio.apirestfultest.repositories;

import com.uniajc.sergio.apirestfultest.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}