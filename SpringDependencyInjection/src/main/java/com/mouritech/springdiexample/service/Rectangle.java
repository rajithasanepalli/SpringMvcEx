package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("RectangleService")
public class Rectangle implements ShapeService {

	

	public void area(String msg) {
		
		System.out.println("Area of rectangle=length*breadth");
	}

}
