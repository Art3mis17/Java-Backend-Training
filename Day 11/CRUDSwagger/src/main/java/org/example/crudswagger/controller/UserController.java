package org.example.crudswagger.controller;


import org.example.crudswagger.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> userList = new ArrayList<>();

    public List<User> getAllUsers()
    {
        return userList;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        for(User user:userList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        userList.add(user);
        return "User created successfully";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User updatedUser){
        for(User user:userList){
            if(user.getId() == id){
                user.setName(updatedUser.getName());
                return "User updated successfully";
            }
        }
        return "User not found";
    }




}
