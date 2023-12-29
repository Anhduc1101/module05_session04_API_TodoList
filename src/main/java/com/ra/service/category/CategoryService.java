package com.ra.service.category;

import com.ra.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void delete(Long id);
    Category saveOrUpdate(Category category);
    Category findById(Long id);

}
