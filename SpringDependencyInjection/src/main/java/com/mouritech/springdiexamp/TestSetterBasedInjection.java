package com.mouritech.springdiexamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.setterdi.SetterBasedInjectionExample;

public class TestSetterBasedInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loading container with definition(configuration) given in XML file
				//ApplicationContext container = 
						//new ClassPathXmlApplicationContext("applicationContext.xml");
				@SuppressWarnings("resource")
				ApplicationContext container 
				      = new AnnotationConfigApplicationContext(AppConfiguration.class);
				SetterBasedInjectionExample sbie = container.getBean(SetterBasedInjectionExample.class);
				sbie.area();

	}

}
