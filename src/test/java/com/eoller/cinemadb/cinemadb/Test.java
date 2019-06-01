package com.eoller.cinemadb.cinemadb;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import org.jooq.DSLContext;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = CinemadbApplication.class)
public class Test {


  @org.junit.Test
  public void contextLoads() throws ParseException {

  }
}
