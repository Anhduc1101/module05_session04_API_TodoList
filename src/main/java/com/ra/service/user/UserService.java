package com.ra.service.user;

import com.ra.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void delete(Long id);
    User saveOrUpdate(User user);
    User findById(Long id);
    Page<User> getAll(Pageable pageable);
    Page<User> searchByName(Pageable pageable,String name);

}
