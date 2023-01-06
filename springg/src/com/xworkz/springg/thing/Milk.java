package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class Milk extends Object{
		 public Milk() {
			 super();
			 System.out.println("creating Milk by spring");
			 
		 }

		@Override
		public String toString() {
			return "Milk [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


