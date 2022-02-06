package com.akasyuka.website.repositories;

import com.akasyuka.website.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
