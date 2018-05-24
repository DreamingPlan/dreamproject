package com.chen.dreamproject.services;

import com.chen.dreamproject.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void saveUser(User user);
    User findOne(Long id);
    void delete(Long id);

}
