package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class God extends Object{
		 public God() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "God [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


