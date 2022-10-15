package com.arturces.workshopspringbootmongodb.services;

import com.arturces.workshopspringbootmongodb.domain.User;
import com.arturces.workshopspringbootmongodb.repository.UserRepository;
import com.arturces.workshopspringbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
