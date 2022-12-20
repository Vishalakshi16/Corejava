package com.xworkz.inbuiltfunction;
import com.xworkz.inbuiltfunction.ChocalateTester;
public class ChocalateTester {

	

		


		public static void main(String[] args) {
			
			String str="kgf2 is a movie";
			 System.out.println(str.toString());//jvm
			
			AnimalDTO ch=new AnimalDTO();
			ch.setId(1);
			ch.setName("cat");
			System.out.println(ch);
			
			
			AnimalDTO ch1=new AnimalDTO();
			ch1.setId(2);
			ch1.setName("dog");
			System.out.println(ch1);
			System.out.println(ch==ch1);
			System.out.println(ch.equals(ch1));
			
			
			System.out.println(ch1.hashCode());
		
		}
	}


