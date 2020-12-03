package com.adil.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Car car = (Car) context.getBean("car");
		car.drive();

//		Tire t = (Tire) context.getBean("tire");
//
//		System.out.println(t);
	}
}
