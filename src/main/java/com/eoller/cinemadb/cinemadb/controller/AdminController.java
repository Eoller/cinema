package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin/user")
    public ResponseEntity getAllUsers(Principal principal){
        return new ResponseEntity(userRepository.getAll(), HttpStatus.OK);
    }

}
