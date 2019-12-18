package com.stone.etour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stone.etour.mapper")
public class EtourApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtourApplication.class, args);
	}

}
