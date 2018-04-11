package edu.qd.hds.grading;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("edu.qd.hds.grading.dao")
public class GradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradingApplication.class, args);
	}
}
