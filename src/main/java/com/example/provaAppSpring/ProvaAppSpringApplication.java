package com.example.provaAppSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ProvaAppSpringApplication {

	public static void main(String[] args) {
			SpringApplication.run(ProvaAppSpringApplication.class, args);

	}

	@Bean(name = "mysqlDataSource")
	@Primary
	public DataSource mysqlDataSource()
	{
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/testdavide");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("rootuser89");
		return dataSourceBuilder.build();
	}

}
