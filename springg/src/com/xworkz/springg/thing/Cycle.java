package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class Cycle extends Object{
		 public Cycle() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "Cycle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


