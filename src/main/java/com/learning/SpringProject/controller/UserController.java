package com.learning.SpringProject.controller;

import com.learning.SpringProject.model.User;
import com.learning.SpringProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getUserList();
        if (Objects.nonNull(users) && users.size() > 0) {
            return ResponseEntity.ok(users);
            //  return new ResponseEntity<List<User>>( users,HttpStatus.OK);
        } else {
            // return new ResponseEntity<List<User>>( HttpStatus.BAD_REQUEST);
            return ResponseEntity.badRequest().build();
        }
    }
}
