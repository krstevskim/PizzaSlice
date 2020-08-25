package com.finki.pizzaslice.services;

import com.finki.pizzaslice.models.Order;
import com.finki.pizzaslice.models.User;
import com.finki.pizzaslice.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    public Boolean isAdmin(Long id){
        final User user = userRepository.findById(id).orElseThrow();
        return user.getRole();
    }

    public List<Order> getUserOrders(Long id){
        User user =  userRepository.findById(id).orElse(null);
        return user.getOrders().stream().collect(Collectors.toList());
    }

}
