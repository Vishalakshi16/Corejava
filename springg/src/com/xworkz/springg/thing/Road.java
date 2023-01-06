package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	
	@Component
	public class Road extends Object{
		 public Road() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Road [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}

