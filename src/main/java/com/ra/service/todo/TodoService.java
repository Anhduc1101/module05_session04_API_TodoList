package com.ra.service.todo;

import com.ra.model.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findAll();
    Todo saveOrUpdate(Todo todo);
    Todo findById(int id);
    void delete(int id);
}
