package com.xworkz.autowiredBean.Boot;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowiredBean.Configuration.GhostConfiguration;

public class GhostRunner {
	
	public static void main(String args[]) {
		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);
		//System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
	}

}
