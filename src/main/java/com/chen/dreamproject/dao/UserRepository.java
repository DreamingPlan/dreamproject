package com.chen.dreamproject.dao;


import com.chen.dreamproject.entity.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User,Long> {
    List<User> findAllByAge(int age);

}
