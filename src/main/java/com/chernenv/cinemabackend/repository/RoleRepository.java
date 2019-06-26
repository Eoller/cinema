package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.domain.security.Role;
import com.chernenv.cinemabackend.mapper.RoleMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.chernenv.cinemabackend.generated.tables.Role.ROLE;

@Repository
@Transactional
public class RoleRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Role> getAll(){
        RoleMapper roleMapper = new RoleMapper();
        return dslContext.selectFrom(ROLE).fetch(roleMapper::map);
    }
}
