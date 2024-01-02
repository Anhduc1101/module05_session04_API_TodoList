package com.ra.repository;

import com.ra.model.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails,Long> {
}
