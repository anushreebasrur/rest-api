package com.learning.SpringProject.service;

import com.learning.SpringProject.model.User;
import com.learning.SpringProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
   private UserRepository userRepository;
    public List<User> getUserList() {
        List<User> users = new ArrayList<>();

        users=   userRepository.findAll();
        return users;
    }
}
