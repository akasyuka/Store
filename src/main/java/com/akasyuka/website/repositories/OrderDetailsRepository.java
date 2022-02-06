package com.akasyuka.website.repositories;

import com.akasyuka.website.models.OrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
}
