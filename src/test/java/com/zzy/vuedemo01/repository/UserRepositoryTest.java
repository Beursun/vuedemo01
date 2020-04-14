package com.zzy.vuedemo01.repository;

import com.zzy.vuedemo01.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findAll(){
        PageRequest pageRequest = PageRequest.of(1,2);
        Page<User> page = userRepository.findAll(pageRequest);
        int i=0;
        System.out.println(userRepository.findAll());
    }

    @Test
    void save(){
        User user = new User();
        user.setName("ZZZ");
        user.setAge(99);
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

    @Test
    void update(){
        User user = new User();

    }

}