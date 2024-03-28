package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.pack.stud;
import com.practice.demo.demo;

//the 2nd class is not associated with root package so that we need to write the @componentScan package
//it will going to scan all package which are present at @ComponentScan annotation

@ComponentScan({"com.pack", "com.practice"})
@SpringBootApplication
public class Recall1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Recall1Application.class, args);
		
		//demo object
		demo d =context.getBean(demo.class);
		System.out.println(d.hello());
		
		//demo objects
		
		demo d1 =context.getBean(demo.class);
		demo d2 =context.getBean(demo.class);
		
		//here we are checking the object is singletone or prototype
		//by default the objects which are created by the IOC are singletone
		//if we want to change the object everytime then we need to write 
		//@prototype annotation on the top of @component annotation
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		stud s =context.getBean(stud.class);
		s.greet();
	}

}
