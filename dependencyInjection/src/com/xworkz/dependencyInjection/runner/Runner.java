package com.xworkz.dependencyInjection.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dependencyInjection.bean.Shell;
import com.xworkz.dependencyInjection.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
        
        System.out.println(spring.getBeanDefinitionCount());
        
       
        
	}

}
