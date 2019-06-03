package com.eoller.cinemadb.cinemadb.mapper;


import com.eoller.cinemadb.cinemadb.domain.security.UserRole;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRoleRecord;

public class UserRoleRecordMapper {

    public UserRoleRecord map(UserRole userRole){
        return new UserRoleRecord(userRole.getId(),userRole.getRole().getId(),userRole.getUser().getId());
    }
}
