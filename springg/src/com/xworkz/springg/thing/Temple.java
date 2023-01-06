package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	
	@Component
	public class Temple extends Object{
		 public Temple() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Temple [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}

