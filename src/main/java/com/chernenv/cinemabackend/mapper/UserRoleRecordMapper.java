package com.chernenv.cinemabackend.mapper;


import com.chernenv.cinemabackend.generated.tables.records.UserRoleRecord;
import com.chernenv.cinemabackend.domain.security.UserRole;

public class UserRoleRecordMapper {

    public UserRoleRecord map(UserRole userRole){
        return new UserRoleRecord(userRole.getId(),userRole.getRole().getId(),userRole.getUser().getId());
    }
}
