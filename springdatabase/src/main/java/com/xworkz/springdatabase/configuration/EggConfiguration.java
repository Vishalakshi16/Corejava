package com.xworkz.springdatabase.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz")
public class EggConfiguration {
	public EggConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	/*@Bean
	public ViewResolver viewResolver() {
		System.out.println("registreing view resolver");
		return new InternalResourceViewResolver("/",".jsp");
	}*/
	

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
	System.out.println("registreing LocalContainerEntityManagerFactoryBean ");
	LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
	return bean;
}

}
