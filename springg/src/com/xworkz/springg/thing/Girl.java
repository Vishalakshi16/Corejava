package com.xworkz.springg.thing;

import org.springframework.stereotype.Component;


	@Component
	public class Girl extends Object{
		 public Girl() {
			 super();
			 System.out.println("creating BhashyamCircle by spring");
			 
		 }

		@Override
		public String toString() {
			return "BhashyamCircle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		}


