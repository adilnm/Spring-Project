package com.adil.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println("Drive a Toyota");
	}
}
