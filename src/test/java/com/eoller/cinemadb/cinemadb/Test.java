package com.eoller.cinemadb.cinemadb;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.repository.MovieShowRepository;
import com.eoller.cinemadb.cinemadb.service.MovieShowService;
import org.jooq.DSLContext;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = CinemadbApplication.class)
@Transactional("transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

  @Autowired
  private DSLContext dslContext;

  @Autowired
  private MovieShowService movieShowService;

  @org.junit.Test
  public void contextLoads() {

    List<MovieShow> allByCinemaIdAndDate = movieShowService.getAllByCinemaIdAndDate(6L, new Date(2019, 04, 30));

    System.out.println("------");
  }
}
