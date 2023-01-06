package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class Mask extends Object{
		 public Mask() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Mask [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


