package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);
        List<String> tab = Arrays.asList("1", "2", "3", "4");


        List<String> chaine = Arrays.asList("a", "b", "c");
        List<String> reslt = chaine.stream().map(String::toUpperCase).collect(Collectors.toList());
        reslt.forEach(System.out::print);
	}




}
