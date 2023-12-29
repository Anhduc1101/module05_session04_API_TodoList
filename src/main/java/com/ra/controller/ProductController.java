package com.ra.controller;

import com.ra.model.dto.ProductDTO;
import com.ra.model.entity.Category;
import com.ra.model.entity.Product;
import com.ra.service.category.CategoryService;
import com.ra.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

//    lay list
    @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> get_list_products(){
        List<ProductDTO> productDTOList=productService.findAll();
        return new ResponseEntity<>(productDTOList, HttpStatus.OK);
    }

//    them moi
    @PostMapping("/products")
    public ResponseEntity<ProductDTO> create_product(@RequestBody ProductDTO productDTO){
        ProductDTO newPro=productService.saveOrUpdate(productDTO);
        return new ResponseEntity<>(newPro,HttpStatus.OK);
    }

//    xoa
    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        if(productService.findById(id)!=null){
            productService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
    }

//    chinh sua
    @GetMapping("products/{id}")
    public ResponseEntity<?> edit(@PathVariable("id") Long id){
        ProductDTO idEdit=productService.findById(id);
        if (idEdit!=null){
            return new ResponseEntity<>(idEdit,HttpStatus.OK);
        }
        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,@RequestBody ProductDTO productDTO){
        ProductDTO productDTO1 = productService.findById(id);
        productDTO1.setProductName(productDTO.getProductName());
        productDTO1.setStatus(productDTO.getStatus());
        productDTO1.setCategoryId(productDTO.getCategoryId());
        ProductDTO newPro=productService.saveOrUpdate(productDTO1);
        return new ResponseEntity<>(newPro,HttpStatus.OK);
    }
}
