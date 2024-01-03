package com.ra.service.category;

import com.ra.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Page<Category> getAll(Pageable pageable);
    Page<Category> searchByName(Pageable pageable,String name);
    void delete(Long id);
    Category saveOrUpdate(Category category);
    Category findById(Long id);

}
