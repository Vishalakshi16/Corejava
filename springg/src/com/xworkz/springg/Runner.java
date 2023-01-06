package com.xworkz.springg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

import com.xworkz.springg.configuration.SpringConfiguration;
import com.xworkz.springg.thing.BhashyamCircle;
//import com.xworkz.thing.BhashyamCircle;

public class Runner {
	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		BhashyamCircle ref=spring.getBean(BhashyamCircle.class);
		System.out.println(ref);
	}

}
