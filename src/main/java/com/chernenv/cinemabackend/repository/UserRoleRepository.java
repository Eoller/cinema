package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.domain.security.UserRole;
import com.chernenv.cinemabackend.generated.tables.records.UserRoleRecord;
import com.chernenv.cinemabackend.mapper.UserRoleMapper;
import com.chernenv.cinemabackend.mapper.UserRoleRecordMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.chernenv.cinemabackend.generated.tables.UserRole.USER_ROLE;

@Repository
@Transactional
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

    public UserRole insert(UserRole userRole) {
        UserRoleRecordMapper mapper = new UserRoleRecordMapper();
        UserRoleRecord userRoleRecord = dslContext.insertInto(USER_ROLE).set(mapper.map(userRole)).returning().fetchOne();
        userRole.setId(userRoleRecord.getId());
        return userRole;
    }
}
