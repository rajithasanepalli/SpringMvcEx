package com.mouritech.springdiexamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.fieldbaseddi.FieldBasedInjection;
public class TestFieldBasedInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					@SuppressWarnings("resource")
			ApplicationContext container 
			      = new AnnotationConfigApplicationContext(AppConfiguration.class);
			FieldBasedInjection fbie = container.getBean(FieldBasedInjection.class);
			fbie.area();
		}
	}


