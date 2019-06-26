package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.UserRecord;
import com.chernenv.cinemabackend.domain.security.User;

public class UserMapper {

    public User map(UserRecord userRecord) {
        return new User(
                userRecord.getId(),
                userRecord.getUsername(),
                userRecord.getPassword(),
                userRecord.getFirstname(),
                userRecord.getLastname(),
                userRecord.getEmail(),
                userRecord.getPhone(),
                userRecord.getEnabled()
        );
    }

}
