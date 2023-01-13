package com.xworkz.springReference.boot;


import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springReference.bean.Assistant;
import com.xworkz.springReference.bean.CameraMan;
import com.xworkz.springReference.bean.Movie;
import com.xworkz.springReference.bean.Polymath;
import com.xworkz.springReference.configuration.OptimisticConfiguration;
import com.xworkz.springReference.configuration.ProducerConfiguration;






public class Runner {
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(OptimisticConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		Polymath ref=spring.getBean(Polymath.class);
		System.out.println(ref);
		
		ApplicationContext spring1=new AnnotationConfigApplicationContext(ProducerConfiguration.class);
		System.out.println(Arrays.toString(spring1.getBeanDefinitionNames()));
		
		Assistant ref1=spring.getBean(Assistant.class);
		System.out.println(ref1);
		
		CameraMan ref2=spring.getBean(CameraMan.class);
		System.out.println(ref2);
		
		Movie ref3=spring.getBean(Movie.class);
		System.out.println(ref3);
	}

}
