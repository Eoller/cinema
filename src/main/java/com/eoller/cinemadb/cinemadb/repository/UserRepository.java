package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.security.User;
import com.eoller.cinemadb.cinemadb.mapper.UserMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.eoller.cinemadb.cinemadb.generated.tables.User.USER;

@Repository
public class UserRepository {

    @Autowired
    private DSLContext dslContext;

    public Optional<User> findByUsername(String username){
        UserMapper userMapper = new UserMapper();
        return Optional
                .ofNullable(dslContext.selectFrom(USER).where(USER.USERNAME.eq(username)).fetchOne(userMapper::map));
    }

    public List<User> getAll(){
        UserMapper userMapper = new UserMapper();
        return dslContext.selectFrom(USER).fetch(userMapper::map);
    }

}
