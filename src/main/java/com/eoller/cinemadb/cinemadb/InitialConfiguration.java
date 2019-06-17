package com.eoller.cinemadb.cinemadb;

import org.jooq.ExecuteContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;
import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
public class InitialConfiguration {

  @Autowired
  private DataSource dataSource;

  @Autowired
  private Environment environment;


  @Bean
  public DataSource dataSource() {
    return createDatasource();
  }

  public DataSource createDatasource() {
    return DataSourceBuilder
      .create()
      .username("root")
      .password("ghjcnjgfhjkm123")
      .url("jdbc:mysql://localhost:3306/cinemaDBtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC")
      .build();
  }

  @Bean
  public DataSourceConnectionProvider connectionProvider() {
    return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource));
  }

  @Bean
  public DefaultDSLContext dsl() {
    return new DefaultDSLContext(configuration());
  }

  private DefaultConfiguration configuration() {
    DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
    jooqConfiguration.set(connectionProvider());
    jooqConfiguration.set(new Settings().withRenderSchema(false));
    jooqConfiguration.setSQLDialect(SQLDialect.MYSQL);
    jooqConfiguration.set(new DefaultExecuteListenerProvider(new ExceptionTranslator()));


    return jooqConfiguration;
  }

  private class ExceptionTranslator extends DefaultExecuteListener {

    @Override
    public void exception(ExecuteContext context) {
      SQLDialect dialect = context.configuration().dialect();
      SQLExceptionTranslator translator = new SQLErrorCodeSQLExceptionTranslator(dialect.name());

      context.exception(translator.translate("Access database using jOOQ", context.sql(), context.sqlException()));
    }
  }


}
