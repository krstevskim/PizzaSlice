package com.finki.pizzaslice.controllers;

import com.finki.pizzaslice.models.Order;
import com.finki.pizzaslice.models.User;
import com.finki.pizzaslice.services.UserService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @GetMapping(path = "{id}")
    public Optional<User> getUser(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping("/add")
    public User addUser(@NotNull @RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
    }

    @GetMapping("{id}/admin")
    public ResponseEntity<Boolean> isUserAdmin(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.isAdmin(id));
    }

    @GetMapping("{id}/orders")
    public ResponseEntity<List<Order>> getUserOrders(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.getUserOrders(id));
    }
}
