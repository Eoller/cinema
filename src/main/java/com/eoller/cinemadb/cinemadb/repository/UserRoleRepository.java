package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.security.UserRole;
import com.eoller.cinemadb.cinemadb.mapper.UserRoleMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.eoller.cinemadb.cinemadb.generated.tables.UserRole.USER_ROLE;

@Repository
public class UserRoleRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    public List<UserRole> getAll(){
        UserRoleMapper userRoleMapper = new UserRoleMapper(userRepository.getAll(),roleRepository.getAll());
        return dslContext.selectFrom(USER_ROLE).fetch(userRoleMapper::map);
    }

    public List<UserRole> getByUserId(long userId){
        UserRoleMapper userRoleMapper = new UserRoleMapper(userRepository.getAll(),roleRepository.getAll());
        return dslContext.selectFrom(USER_ROLE).where(USER_ROLE.USER_ID.eq(userId)).fetch(userRoleMapper::map);
    }

}
