package com.xworkz.springReference.configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.springReference.bean.Polymath;

@Configuration
@ComponentScan(basePackages="com.xworkz.springReference",
excludeFilters= {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value=Collection.class)})
public class OptimisticConfiguration {
	

	
	public OptimisticConfiguration() {
		System.out.println("creating OptimisticConfiguration with no argument constructor ");
	}

}
