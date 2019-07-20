package com.wmlbog.weblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication()
public class WeblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeblogApplication.class, args);
	}

}
