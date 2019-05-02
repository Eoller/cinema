package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.domain.security.Role;
import com.eoller.cinemadb.cinemadb.domain.security.User;
import com.eoller.cinemadb.cinemadb.domain.security.UserRole;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRoleRecord;

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
