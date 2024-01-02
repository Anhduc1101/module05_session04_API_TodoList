package com.ra.repository;

import com.ra.model.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
