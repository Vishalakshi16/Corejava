package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	
	@Component
	public class Application extends Object{
		 public Application() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Application [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


