package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("CircleService")
public class CircleService implements ShapeService {

	public void area() {
		System.out.println("Area of circle=22/7*r*r");
		
	}

	public void area(String msg) {
		// TODO Auto-generated method stub
		
	}

}
