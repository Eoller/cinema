package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.security.User;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRecord;

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
