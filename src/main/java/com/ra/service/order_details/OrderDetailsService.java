package com.ra.service.order_details;

import com.ra.model.dto.OrderDetailsDTO;
import com.ra.model.dto.OrdersDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderDetailsService {
    List<OrderDetailsDTO> findAll();
    void delete(Long id);
    OrderDetailsDTO findById(Long id);
    OrderDetailsDTO saveOrUpdate(OrderDetailsDTO orderDetailsDTO);
    Page<OrderDetailsDTO> getAll(Pageable pageable);
    Page<OrderDetailsDTO> searchByOrderDetailsId(Pageable pageable,Integer id);
}
