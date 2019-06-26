package com.chernenv.cinemabackend.domain.dto;

import com.chernenv.cinemabackend.domain.security.Authority;
import com.chernenv.cinemabackend.domain.security.User;
import com.chernenv.cinemabackend.domain.security.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserWithRoles implements UserDetails {

    private User user;
    private List<UserRole> userRoles = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //получить роли которые имеет юзер
        Set<GrantedAuthority> authorities = new HashSet<>();
        userRoles.forEach(userRole -> {
            authorities.add(new Authority(userRole.getRole().getName()));
        });
        return authorities;
    }


    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.user.isEnabled();
    }
}