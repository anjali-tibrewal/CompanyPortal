package com.companyPortal;

import java.util.Arrays;
import java.util.Collections;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.companyPortal.repository.CompanyPortalRepository;

@SpringBootApplication(scanBasePackages = {"com.companyPortal.controller"})
@Configuration("Main applictationContext")
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = {"com.companyPortal.repository"})
@EntityScan(basePackages = {"com.companyPortal.model.entity"})
@ComponentScan(basePackages = {"com.companyPortal"})
public class CompanyPortalApplication extends SpringBootServletInitializer{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	CompanyPortalRepository systemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CompanyPortalApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CompanyPortalApplication.class);
	}
	
	@Bean
	public CorsFilter corsFilter() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration config = new CorsConfiguration();
		//config.setAllowCredentials(true);
		config.setAllowedHeaders(Arrays.asList("Origin", "Content-type", "Accept"));
		config.setAllowedOriginPatterns(Arrays.asList("*"));
		config.setAllowedMethods(Arrays.asList("GET", "PUT", "POST", "DELETE", "OPTIONS", "PATCH"));
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}
}
