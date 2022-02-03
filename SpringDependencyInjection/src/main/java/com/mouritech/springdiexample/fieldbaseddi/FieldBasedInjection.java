package com.mouritech.springdiexample.fieldbaseddi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.ShapeService;
@Component
public class FieldBasedInjection {
	@Autowired
	@Qualifier("SquareService")
	private ShapeService shpeService;


	public ShapeService getShpeService() {
		return shpeService;
	}


	public void setShpeService(ShapeService shpeService) {
		this.shpeService = shpeService;
	}
	public void area() {
		shpeService.area("");
	}
	
}
