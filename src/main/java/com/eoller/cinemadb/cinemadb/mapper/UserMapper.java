package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.domain.security.User;
import com.eoller.cinemadb.cinemadb.domain.security.UserRole;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaHallRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
