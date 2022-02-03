package com.mouritech.springframework.firstapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringFirstApp {

	public static void main(String[] args) {
		//Loading container with definition(configuration) given in XML file
//				ApplicationContext container = 
//						new ClassPathXmlApplicationContext("applicationContext.xml");
//				
//				Quotation qu = (Quotation) container.getBean("quotationService");
//				String quoteForDay = qu.getQuote();
//				System.out.println(quoteForDay);
//				
//				Greetings gr = (Greetings) container.getBean("greetingsService");
//				String wish = gr.getGreet();
//				System.out.println(wish);
//				
//				Employee emp = (Employee) container.getBean("emp");
//				System.out.println(emp);
//				System.out.println(emp.getEmpId());
//				emp.setEmpId(456);
//				System.out.println(emp.getEmpId());
//
//			}
			
	@SuppressWarnings("deprecation")
	XmlBeanFactory factory = new XmlBeanFactory
			(new ClassPathResource("applicationContext.xml"));
	
	Quotation qu = (Quotation) factory.getBean("quotationService");
	String quoteForDay = qu.getQuote();
	System.out.println(quoteForDay);
	
	Greetings gr = (Greetings) factory.getBean("greetingsService");
	String wish = gr.getGreet();
	System.out.println(wish);
	
	Employee emp = (Employee) factory.getBean("emp");
	System.out.println(emp);
	System.out.println(emp.getEmpId());
	emp.setEmpId(456);
	System.out.println(emp.getEmpId());

}

}
