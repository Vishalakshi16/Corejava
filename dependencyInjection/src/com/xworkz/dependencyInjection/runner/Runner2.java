package com.xworkz.dependencyInjection.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dependencyInjection.bean.Browser;
import com.xworkz.dependencyInjection.bean.Chrome;
import com.xworkz.dependencyInjection.bean.FireBox;
import com.xworkz.dependencyInjection.configuration.SpringConfiguration;

public class Runner2 {
	
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
        
        Browser ref=spring.getBean(Chrome.class);
        ref.browser();
        
        Browser ref2=spring.getBean(FireBox.class);;
        ref2.browser();
	}

}
