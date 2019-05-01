package com.eoller.cinemadb.cinemadb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class CinemadbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemadbApplication.class, args);
    }

}
