package com.xworkz.aeroplane.configuration;

	
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


	@Configuration
	@ComponentScan("com.xworkz.aeroplane")
	
	public class AeroplaneWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
		
		public AeroplaneWebInit() {
			System.out.println("Created "+this.getClass().getSimpleName());
		}
		
		

		@Override
		protected Class<?>[] getRootConfigClasses() {
			System.out.println("running getRootConfigClasses");
			Class[] ref = {AeroplaneConfiguration.class};
			return ref;
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			System.out.println("running getServletConfigClasses");
			Class[] ref1 = {AeroplaneConfiguration.class};
			return ref1;
		}

		@Override
		protected String[] getServletMappings() {
			System.out.println("running getServletMappings");
			String[] str = {"/"};
			return str;
		}
		
		@Override
		public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
			System.out.println("running configureDefaultServletHandling");
			configurer.enable();
		

	}

	}

