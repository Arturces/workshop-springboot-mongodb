package com.arturces.workshopspringbootmongodb.resources.exception;

import com.arturces.workshopspringbootmongodb.domain.Post;
import com.arturces.workshopspringbootmongodb.domain.User;
import com.arturces.workshopspringbootmongodb.dto.UserDTO;
import com.arturces.workshopspringbootmongodb.services.PostService;
import com.arturces.workshopspringbootmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    //@GetMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body((obj));
    }

}

