package com.xworkz.autowiredBean.Boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowiredBean.Bean.Ghosts;
import com.xworkz.autowiredBean.Configuration.GhostsConfiguration;

public class GhostsRunner {
	
	ApplicationContext container = new AnnotationConfigApplicationContext(GhostsConfiguration.class);
	//System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

	Ghosts refOfGhosts = container.getBean(Ghosts.class);
	System.out.println(refOfGhosts);
}


