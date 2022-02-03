package com.mouritech.springdiexample.constructordi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.ShapeService;

@Component
public class ConstructorBasedDIExample {
	
	private ShapeService shpeService;

	@Autowired
	public ConstructorBasedDIExample(@Qualifier("RectangleService") ShapeService shpeService) {
		super();
		this.shpeService = shpeService;
	}

	public ShapeService getShpeService() {
		return shpeService;
	}

	public void setShpeService(ShapeService shpeService) {
		this.shpeService = shpeService;
	}

	public void area(String msg) {
		shpeService.area("Area of rectangle");
	}

}
