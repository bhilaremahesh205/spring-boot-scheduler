package com.xadmin.springbootscheduler.dao;



import com.xadmin.springbootscheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User,Integer>{
}
