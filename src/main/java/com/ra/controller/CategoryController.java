package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*") // dung de truy cap moi duong dan ca noi bo lan ngoai bo
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

//    lay du lieu
    @GetMapping("/categories")
    public ResponseEntity<List<Category>> categories() {
        List<Category> categories = categoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

//    them moi
    @PostMapping("/categories")
    public ResponseEntity<Category> create_category(@RequestBody Category category) {
        Category newCat = categoryService.saveOrUpdate(category);
        return new ResponseEntity<>(newCat, HttpStatus.CREATED);
    }

//    chinh sua
    @GetMapping("/categories/{id}")
    public ResponseEntity<?> get_category_by_id(@PathVariable("id") Long id) {
        Category idEdit = categoryService.findById(id);
        if (idEdit != null) {
            return new ResponseEntity<>(idEdit, HttpStatus.OK);
        }
        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<Category> update_category(@PathVariable("id") Long id,@RequestBody Category category){
        Category category1=categoryService.findById(id);
        category1.setCategoryName(category.getCategoryName());
        category1.setStatus(category1.getStatus());
        Category updateCat=categoryService.saveOrUpdate(category1);
        return new ResponseEntity<>(updateCat,HttpStatus.OK);
    }

//    xoa
//    @DeleteMapping("/categories/{id}")
//    public ResponseEntity<?> delete_category(@PathVariable("id") Long id){
//        if (categoryService.findById(id)!=null){
//            categoryService.delete(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
//    }
    @DeleteMapping("/categories/{id}")
    public ResponseEntity<Category> delete_category(@PathVariable("id") Long id,@RequestBody Category category){
        Category cat=categoryService.findById(id);
        if (cat!=null){
            categoryService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
