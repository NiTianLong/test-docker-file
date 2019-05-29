package com.longe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.longe.dao")
public class DockerFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerFileApplication.class, args);
	}

}
