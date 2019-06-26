package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.UserRecord;
import com.chernenv.cinemabackend.domain.security.User;

public class UserRecordMapper {

    public UserRecord map(User user){
        return new UserRecord(
                user.getId(),
                user.getEmail(),
                user.isEnabled(),
                user.getFirstName(),
                user.getLastName(),
                user.getPassword(),
                user.getPhone(),
                user.getUsername()
        );
    }

}
