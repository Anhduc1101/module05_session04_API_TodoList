package com.ra.repository;

import com.ra.model.entity.OrderDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails,Long> {
    Page<OrderDetails> searchOrderDetailsById(Pageable pageable,Integer id);
}
