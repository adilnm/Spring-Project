package com.adil.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("Ride a bike");
	}
}
