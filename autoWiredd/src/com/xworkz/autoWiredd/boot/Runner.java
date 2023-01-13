package com.xworkz.autoWiredd.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autoWiredd.bean.Experience;
import com.xworkz.autoWiredd.bean.Government;
import com.xworkz.autoWiredd.bean.HardwareShop;
import com.xworkz.autoWiredd.bean.Item;
import com.xworkz.autoWiredd.bean.Pencil;
import com.xworkz.autoWiredd.bean.Rubber;
import com.xworkz.autoWiredd.bean.Software;
import com.xworkz.autoWiredd.bean.SoftwareEngineer;
import com.xworkz.autoWiredd.configuration.ItemConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
	
	
	ApplicationContext spring=new AnnotationConfigApplicationContext(ItemConfiguration.class);
    Item ref=spring.getBean("material",Item.class);
    System.out.println(ref.getName());
    
    String[] beanNames=spring.getBeanDefinitionNames();
    System.out.println(Arrays.toString(beanNames));
    
    Experience ref1=spring.getBean(Experience.class);
    System.out.println(ref1);

    Government ref3 = spring.getBean(Government.class);
    System.out.println(ref3);
    
    HardwareShop ref2=spring.getBean(HardwareShop.class);
    System.out.println(ref2);
    
    Software ref4=spring.getBean(Software.class);
    System.out.println(ref2);
    
    
    
    SoftwareEngineer ref5=spring.getBean(SoftwareEngineer.class);
    System.out.println(ref5);
    
    Rubber ref7=spring.getBean(Rubber.class);
    		System.out.println(ref7);
    
        Pencil ref9 = spring.getBean(Pencil.class);
    System.out.println(ref9);
    
    
    
    
	}
	
}
