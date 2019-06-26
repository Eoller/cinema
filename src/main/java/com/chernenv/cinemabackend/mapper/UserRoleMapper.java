package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.UserRoleRecord;
import com.chernenv.cinemabackend.domain.security.Role;
import com.chernenv.cinemabackend.domain.security.User;
import com.chernenv.cinemabackend.domain.security.UserRole;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserRoleMapper {

    private Map<Long, User> userMap;
    private Map<Long, Role> roleMap;

    public UserRoleMapper(List<User> users, List<Role> roles){
        this.userMap = users.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.roleMap = roles.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public UserRole map(UserRoleRecord userRoleRecord){
        Role role = roleMap.get(userRoleRecord.getRoleId());
        User user = userMap.get(userRoleRecord.getUserId());
        UserRole userRole = new UserRole(userRoleRecord.getId(),user,role);
        return userRole;
    }

}
