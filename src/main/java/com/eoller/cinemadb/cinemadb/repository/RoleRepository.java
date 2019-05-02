package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.security.Role;
import com.eoller.cinemadb.cinemadb.mapper.RoleMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.eoller.cinemadb.cinemadb.generated.tables.Role.ROLE;

@Repository
public class RoleRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Role> getAll(){
        RoleMapper roleMapper = new RoleMapper();
        return dslContext.selectFrom(ROLE).fetch(roleMapper::map);
    }
}
