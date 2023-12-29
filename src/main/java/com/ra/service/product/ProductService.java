package com.ra.service.product;

import com.ra.model.dto.ProductDTO;
import com.ra.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAll();
    void delete(Long id);
    ProductDTO saveOrUpdate(ProductDTO productDTO);
    ProductDTO findById(Long id);
}
