package com.zzy.vuedemo01.controller;

import com.zzy.vuedemo01.entity.User;
import com.zzy.vuedemo01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{page}/{size}")
    Page<User> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return userRepository.findAll(request);
    }

    @RequestMapping("/save")
    public String save(@RequestBody User user){
        User usern = userRepository.save(user);
        if(usern != null){
            return "success";
        }else {
            return "false";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody User user){
        User usern = userRepository.save(user);
        if(usern != null){
            return "success";
        }else {
            return "false";
        }
    }
}
