package com.eoller.cinemadb.cinemadb;

import org.jooq.DSLContext;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = CinemadbApplication.class)
@Transactional("transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

  @Autowired
  private DSLContext dslContext;


  @org.junit.Test
  public void contextLoads() {
  }
}
