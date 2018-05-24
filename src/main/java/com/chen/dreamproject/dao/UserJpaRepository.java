package com.chen.dreamproject.dao;

import com.chen.dreamproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserJpaRepository extends JpaRepository<User,Long> {

}
