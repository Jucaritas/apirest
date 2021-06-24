package com.backend.apirest.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ConfigConnectionDB {
	
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/desarrollo");
		dataSource.setUsername("postgres");
		dataSource.setPassword("toor");
		dataSource.setMaximumPoolSize(5);
		return dataSource;
	}
	
}
