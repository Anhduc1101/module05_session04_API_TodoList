package com.ra.service.product;

import com.ra.model.dto.ProductDTO;
import com.ra.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    Page<ProductDTO> getAll(Pageable pageable);
//    Page<Product> getPaginate(Pageable pageable);
//    Page<Product> getAllPaginate(Pageable pageable);
    List<ProductDTO> findAll();
    void delete(Long id);
    ProductDTO saveOrUpdate(ProductDTO productDTO);
    ProductDTO findById(Long id);
    Product findProductById(Long id);
    Page<ProductDTO> searchByName(Pageable pageable,String name);


}
