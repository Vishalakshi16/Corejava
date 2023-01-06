package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class Chocalate extends Object{
		 public Chocalate() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Chocalate [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


