package com.xworkz.springdatabase.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class EggApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer 
implements WebMvcConfigurer{
	
	

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] configClass= {EggConfiguration.class};
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
