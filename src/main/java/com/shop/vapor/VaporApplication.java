package com.shop.vapor;

import com.shop.vapor.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class VaporApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaporApplication.class, args);
	}
}
