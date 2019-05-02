package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.security.Role;
import com.eoller.cinemadb.cinemadb.generated.tables.records.RoleRecord;

public class RoleMapper {

    public Role map(RoleRecord roleRecord){
        return new Role(roleRecord.getId(),roleRecord.getName());
    }

}
