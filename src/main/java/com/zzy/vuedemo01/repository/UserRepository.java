package com.zzy.vuedemo01.repository;

import com.zzy.vuedemo01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
