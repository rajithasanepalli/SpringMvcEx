package com.mouritech.springframework.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFirstApp {

	public static void main(String[] args) {
		// Loading container with definition given in XMl file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		Quotation que = (Quotation) context.getBean("quotationService");
	    String quoteForDay = que.getQuote();
	    System.out.println(quoteForDay);
	    
	    Greetings gre = (Greetings) context.getBean("greetingsService");
	     String wish = gre.getGreet();
	     System.out.println(wish);

	}

}
