package com.chernenv.cinemabackend.service;

import com.chernenv.cinemabackend.repository.UserRepository;
import com.chernenv.cinemabackend.repository.UserRoleRepository;
import com.chernenv.cinemabackend.domain.dto.UserWithRoles;
import com.chernenv.cinemabackend.domain.security.User;
import com.chernenv.cinemabackend.domain.security.UserRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSecurityService implements UserDetailsService {

    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.getByUsername(username);


        if(!user.isPresent()){
            LOG.warn("Username {} not found", username);
            throw new UsernameNotFoundException("Username " + username + " not found");
        }else {
            List<UserRole> userRoles = userRoleRepository.getByUserId(user.get().getId());
            UserWithRoles userWithRoles = new UserWithRoles(user.get(),userRoles);
            return userWithRoles;
        }
    }
}
