package com.eoller.cinemadb.cinemadb.domain.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRole implements Serializable {

    private Long id;
    private User user;
    private Role role;

    public UserRole(User user, Role role){
        this.user = user;
        this.role = role;
    }

}
