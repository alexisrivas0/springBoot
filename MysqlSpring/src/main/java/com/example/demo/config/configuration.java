package com.example.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class configuration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory (DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean lc = new LocalContainerEntityManagerFactoryBean();
		
		lc.setDataSource(dataSource);
		lc.setPackagesToScan("com.example");
		lc.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		lc.setJpaDialect(new HibernateJpaDialect());
		Properties p = new Properties();
		p.setProperty("hibernate.hbm2ddl.auto","create");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		lc.setJpaProperties(p);
		return lc;
	}
}
