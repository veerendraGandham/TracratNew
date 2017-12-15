package com.mk.tracrat.cnfg;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.mk.tracrat.dao")
public class persistanceConfg {
	@Bean
	public DataSource insertDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/tracrat");

		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

	@Bean
	public JdbcTemplate createJt() {
		return new JdbcTemplate(insertDataSource());
	}
}
