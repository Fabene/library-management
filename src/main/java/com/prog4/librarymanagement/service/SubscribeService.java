package com.prog4.librarymanagement.service;
import com.prog4.librarymanagement.model.User;
import com.prog4.librarymanagement.repository.SubscribesCrudOperation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubscribeService {
    private final SubscribesCrudOperation subscribeRepository;
    public List<User> getAllUser(){
        return subscribeRepository.findAll();
    }
    public List<User> saveAllUsers(List<User> users){
        return subscribeRepository.saveAll(users);
    }
    public User saveUser(User user) {
        return subscribeRepository.save(user);
    }
    public void deleteUser(User userId) {
        subscribeRepository.delete(userId);
    }
}