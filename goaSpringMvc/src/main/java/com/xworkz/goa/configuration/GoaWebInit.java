package com.xworkz.goa.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


import com.xworkz.goa.controller.CasinoController;

public class GoaWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public GoaWebInit() {
		System.out.println("created"+getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] configClass= {CasinoController.class};
		System.out.println("configClass"+Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String [] ref= {"/"};
		System.out.println("getServletMappings"+ Arrays.toString(ref));
		
		return ref;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling");
		configurer.enable();
	}
}
