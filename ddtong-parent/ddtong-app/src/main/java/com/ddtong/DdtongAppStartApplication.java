package com.ddtong;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement(order = 10) //开启事务，并设置order值，默认是Integer的最大值
//@ComponentScan
//@EntityScan
public class DdtongAppStartApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DdtongAppStartApplication.class, args);

//		Properties properties = new Properties();
//		String filePath = "C:/workspace/ddtong/src/main/resources/application.properties";
//		Resource resource = new FileSystemResource(filePath);
//		InputStream is = resource.getInputStream();
//		properties.load(is);
//
//		SpringApplication springApplication = new SpringApplication(DdtongAppStartApplication.class);
//		springApplication.setDefaultProperties(properties);
//		springApplication.run(args);

	}
}