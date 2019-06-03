package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.security.User;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRecord;
import com.eoller.cinemadb.cinemadb.mapper.UserMapper;
import com.eoller.cinemadb.cinemadb.mapper.UserRecordMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.eoller.cinemadb.cinemadb.generated.tables.User.USER;

@Repository
@Transactional
public class UserRepository {

    @Autowired
    private DSLContext dslContext;

    public Optional<User> getByUsername(String username){
        UserMapper userMapper = new UserMapper();
        return Optional
                .ofNullable(dslContext.selectFrom(USER).where(USER.USERNAME.eq(username)).fetchOne(userMapper::map));
    }

    public List<User> getAll(){
        UserMapper userMapper = new UserMapper();
        return dslContext.selectFrom(USER).fetch(userMapper::map);
    }

    public Optional<User> getById(long userId) {
        UserMapper mapper = new UserMapper();
        return dslContext.selectFrom(USER).where(USER.ID.eq(userId)).fetchOptional(mapper::map);
    }

    public User insert(User user) {
        UserRecordMapper userRecordMapper = new UserRecordMapper();
        UserRecord userRecord = dslContext.insertInto(USER).set(userRecordMapper.map(user)).returning().fetchOne();
        user.setId(userRecord.getId());
        return user;
    }

    public User update(User user) {
        UserRecordMapper userRecordMapper = new UserRecordMapper();
        dslContext.update(USER).set(userRecordMapper.map(user)).where(USER.ID.eq(user.getId())).execute();
        return user;
    }

}
