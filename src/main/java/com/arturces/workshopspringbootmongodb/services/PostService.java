package com.arturces.workshopspringbootmongodb.services;

import com.arturces.workshopspringbootmongodb.domain.Post;
import com.arturces.workshopspringbootmongodb.domain.User;
import com.arturces.workshopspringbootmongodb.dto.UserDTO;
import com.arturces.workshopspringbootmongodb.repository.PostRepository;
import com.arturces.workshopspringbootmongodb.repository.UserRepository;
import com.arturces.workshopspringbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repository.findByTitleContainingIgnoreCase(text);
    }
}
