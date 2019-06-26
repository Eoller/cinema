package com.chernenv.cinemabackend.controller;

import com.chernenv.cinemabackend.conf.SecurityUtility;
import com.chernenv.cinemabackend.repository.UserRepository;
import com.chernenv.cinemabackend.repository.UserRoleRepository;
import com.chernenv.cinemabackend.domain.security.Role;
import com.chernenv.cinemabackend.domain.security.User;
import com.chernenv.cinemabackend.domain.security.UserRole;
import com.chernenv.cinemabackend.util.ParamsVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Optional;

@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @PostMapping("/newuser")
    public ResponseEntity newUserPost(@RequestBody HashMap<String, String> mapper) {
        Optional<String> username = Optional.ofNullable(mapper.get("username"));
        Optional<String> userEmail = Optional.ofNullable(mapper.get("email"));
        Optional<String> phoneNumber = Optional.ofNullable(mapper.get("phone"));
        Optional<String> firstName = Optional.ofNullable(mapper.get("firstName"));
        Optional<String> lastName = Optional.ofNullable(mapper.get("lastName"));
        Optional<String> password = Optional.ofNullable(mapper.get("password"));

        if (!ParamsVerifier.allRequiredParamsProvided(username, userEmail, phoneNumber, firstName, lastName, password)) {
            return new ResponseEntity("Not all parameters was provided", HttpStatus.BAD_REQUEST);
        }

        if (userRepository.getByUsername(username.get()).isPresent()) {
            return new ResponseEntity(1, HttpStatus.BAD_REQUEST);
        }

        String encryptedPassword = SecurityUtility.passwordEncoder().encode(password.get());
        User user = new User(0l, username.get(), encryptedPassword, firstName.get(), lastName.get(),
                userEmail.get(), phoneNumber.get(), true);

        User created = userRepository.insert(user);
        userRoleRepository.insert(new UserRole(0l, user, new Role(1l, "ROLE_USER")));
        return new ResponseEntity(created, HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity userInfo(Principal principal) {
        Optional<User> result = userRepository.getByUsername(principal.getName());
        if (!result.isPresent()) {
            return new ResponseEntity("user does not exists", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(result.get(), HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity updateUserInfo(@RequestBody User user) {
        Optional<User> byId = userRepository.getById(Optional.ofNullable(user.getId()).orElse(0l));
        if (byId.isPresent()) {
            userRepository.update(user);
            return new ResponseEntity(user, HttpStatus.OK);
        }
        Optional<User> byUsername = userRepository.getByUsername(Optional.ofNullable(user.getUsername()).orElse(""));
        if (byUsername.isPresent()) {
            user.setId(byUsername.get().getId());
            userRepository.update(user);
            return new ResponseEntity(user, HttpStatus.OK);
        }
        return new ResponseEntity("Update failed, id and username do not exist", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/user/password")
    public ResponseEntity changePass(@RequestBody HashMap<String, String> mapper, Principal principal) {
        Optional<String> oldPassword = Optional.ofNullable(mapper.get("oldPassword"));
        Optional<String> newPassword = Optional.ofNullable(mapper.get("newPassword"));
        Optional<User> byId = userRepository.getByUsername(principal.getName());
        if (!ParamsVerifier.allRequiredParamsProvided(oldPassword, newPassword)) {
            return new ResponseEntity("Not all params provided", HttpStatus.BAD_REQUEST);
        }

        if (!byId.isPresent())
            return new ResponseEntity("User id not found", HttpStatus.BAD_REQUEST);
        if (!SecurityUtility.passwordEncoder().matches(oldPassword.get(), byId.get().getPassword()))
            return new ResponseEntity("Incorrect old password", HttpStatus.BAD_REQUEST);

        byId.get().setPassword(SecurityUtility.passwordEncoder().encode(newPassword.get()));
        userRepository.update(byId.get());
        return new ResponseEntity("Password updated", HttpStatus.OK);
    }


}
