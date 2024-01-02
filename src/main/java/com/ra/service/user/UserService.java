package com.ra.service.user;

import com.ra.model.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void delete(Long id);
    User saveOrUpdate(User user);
    User findById(Long id);

}
