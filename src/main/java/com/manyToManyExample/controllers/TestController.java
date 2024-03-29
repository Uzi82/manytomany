package com.manyToManyExample.controllers;

import com.manyToManyExample.entities.User;
import com.manyToManyExample.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {
    private final UserRepository userRepository;
    @GetMapping
    public List<User> index() {
        return userRepository.findAll();
    }
}
