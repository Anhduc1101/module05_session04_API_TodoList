package com.ra.service.orders;

import com.ra.model.dto.OrdersDTO;
import com.ra.model.entity.Orders;

import java.util.List;

public interface OrdersService {
    List<OrdersDTO> findAll();
    void delete(Long id);
    OrdersDTO findById(Long id);
    Orders findOrdersById(Long id);

    OrdersDTO saveOrUpdate(OrdersDTO ordersDTO);
}
