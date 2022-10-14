package com.arturces.workshopspringbootmongodb.resources;

import com.arturces.workshopspringbootmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

@RequestMapping(method = RequestMethod.GET)
public ResponseEntity<List<User>> findAll() {
        User artur = new User("1", "Artur", "artur@gmail.com");
        User gabi = new User("2", "Gabi", "gabi@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(artur, gabi));

        return ResponseEntity.ok().body(list);
    }
}