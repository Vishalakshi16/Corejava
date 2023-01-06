package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class Area extends Object{
		 public Area() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Area [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


