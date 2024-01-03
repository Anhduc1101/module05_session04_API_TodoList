package com.ra.service.orders;

import com.ra.model.dto.OrdersDTO;
import com.ra.model.entity.Orders;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrdersService {
    List<OrdersDTO> findAll();
    void delete(Long id);
    OrdersDTO findById(Long id);
    Orders findOrdersById(Long id);

    OrdersDTO saveOrUpdate(OrdersDTO ordersDTO);
    Page<OrdersDTO> searchOrdersById(Pageable pageable,Integer id);
    Page<OrdersDTO> getAll(Pageable pageable);
}
