package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class City extends Object{
		 public City() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "City [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


