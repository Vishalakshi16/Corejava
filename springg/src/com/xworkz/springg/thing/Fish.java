package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;

	
	@Component
	public class Fish extends Object{
		 public Fish() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Fish [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


