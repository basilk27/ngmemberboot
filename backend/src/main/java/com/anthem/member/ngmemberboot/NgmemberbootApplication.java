package com.anthem.member.ngmemberboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NgmemberbootApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure( SpringApplicationBuilder appBuilder ) {
		return appBuilder.sources( NgmemberbootApplication.class );
	}
	
	public static void main(String[] args) {
		SpringApplication.run(NgmemberbootApplication.class, args);
	}
}
