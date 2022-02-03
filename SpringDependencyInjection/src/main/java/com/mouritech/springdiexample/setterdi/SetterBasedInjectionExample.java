package com.mouritech.springdiexample.setterdi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.ShapeService;

@Component
public class SetterBasedInjectionExample {
	

	private ShapeService shpeService;
	public ShapeService getShpeService() {
		return shpeService;
	}

	@Autowired
	//@Qualifier("WhatsAppService")
	@Qualifier("CircleService")
	
	public void setShpeService(ShapeService shpeService) {
		this.shpeService = shpeService;
	}
	public void area() {
		shpeService.area("");
	}

}
