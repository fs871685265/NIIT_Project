package com.stone.etour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
@MapperScan("com.stone.etour.mapper")
public class EtourApplication {

	public static void main(String[] args) {
		//在D盘创建upload文件夹存放图片
		File file = new File("d:\\upload");
		boolean mkdir = file.mkdir();
		System.out.println(mkdir+"-----------");

		SpringApplication.run(EtourApplication.class, args);
	}

}
