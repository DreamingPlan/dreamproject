package com.chen.dreamproject.services;

import com.chen.dreamproject.dao.UserJpaRepository;
import com.chen.dreamproject.dao.UserRepository;
import com.chen.dreamproject.entity.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Cacheable;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
            return userJpaRepository.findAll();
    }

    public void saveUser(User user) {
        userJpaRepository.save(user);

    }




    public User findOne(Long id) {

        Optional<User> users=userJpaRepository.findById(id);

        User user2=new User();
        if(!users.isPresent()){
            user2 =users.get();
        }
        return user2;
    }

    public void delete(Long id) {
        userJpaRepository.deleteById(id);
    }
}
