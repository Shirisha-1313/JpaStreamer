package com.ust.Employee_jpastreamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ust.Employee.jpastreamer","com.speedment.jpastreamer"})
public class EmployeeJpastreamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeJpastreamerApplication.class, args);
	}

}