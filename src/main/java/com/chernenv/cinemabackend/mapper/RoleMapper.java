package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.RoleRecord;
import com.chernenv.cinemabackend.domain.security.Role;

public class RoleMapper {

    public Role map(RoleRecord roleRecord){
        return new Role(roleRecord.getId(),roleRecord.getName());
    }

}
