package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("ok");
		System.out.println("bb");
m();
		SpringApplication.run(DemoApplication.class, args);
	}

	public static void m(){
		System.out.println("m");
	}



}
