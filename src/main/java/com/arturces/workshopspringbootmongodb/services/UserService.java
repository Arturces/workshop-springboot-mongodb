package com.arturces.workshopspringbootmongodb.services;

import com.arturces.workshopspringbootmongodb.domain.User;
import com.arturces.workshopspringbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return  repository.findAll();
    }

}
