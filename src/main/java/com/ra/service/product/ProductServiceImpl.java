package com.ra.service.product;

import com.ra.model.dto.ProductDTO;
import com.ra.model.entity.Category;
import com.ra.model.entity.Product;
import com.ra.repositor.ProductRepository;
import com.ra.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryService categoryService;

    @Override
    public List<ProductDTO> findAll() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for (Product pro : products) {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(pro.getId());
            productDTO.setProductName(pro.getProductName());
            productDTO.setStatus(pro.getStatus());
            productDTO.setCategoryId(pro.getCategory().getId());
            productDTOList.add(productDTO);
        }
        return productDTOList;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductDTO saveOrUpdate(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setProductName(productDTO.getProductName());
        product.setStatus(productDTO.getStatus());
        Category cat = categoryService.findById(productDTO.getCategoryId());
        product.setCategory(cat);
        product = productRepository.save(product);
        ProductDTO saveProductDTO = new ProductDTO();
        saveProductDTO.setId(product.getId());
        saveProductDTO.setProductName(product.getProductName());
        saveProductDTO.setStatus(product.getStatus());
        saveProductDTO.setCategoryId(product.getCategory().getId());
        return saveProductDTO;
    }

    @Override
    public ProductDTO findById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(product.getId());
            productDTO.setProductName(product.getProductName());
            productDTO.setStatus(product.getStatus());
            productDTO.setCategoryId(product.getCategory().getId());
            return productDTO;
        } else {
            return null;
        }
    }
}
