package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("SquareService")
public class SquareService implements ShapeService {

	public void area(String msg) {
		System.out.println("Area of square=length*breadth");
		
	}

}
