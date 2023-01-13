package com.xworkz.autowiredBean.Boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowiredBean.Bean.NewsPaper;
import com.xworkz.autowiredBean.Configuration.NewsPaperConfiguration;

public class NewsPaperRunner {
	
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		NewsPaper refOfNewsPaper = container.getBean(NewsPaper.class);
		System.out.println(refOfNewsPaper);
	}

}
