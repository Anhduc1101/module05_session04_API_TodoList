package com.ra.service.order_details;

import com.ra.model.dto.OrderDetailsDTO;
import com.ra.model.dto.OrdersDTO;

import java.util.List;

public interface OrderDetailsService {
    List<OrderDetailsDTO> findAll();
    void delete(Long id);
    OrderDetailsDTO findById(Long id);
    OrderDetailsDTO saveOrUpdate(OrderDetailsDTO orderDetailsDTO);
}
