package com.xworkz.inbuiltfunction;

import com.xworkz.inbuiltfunction.AnimalDTO;

public class AnimalDTO {
	
	private static  String name;
	private static int id;





	public AnimalDTO() {
		System.out.println(this.getClass().getName());
		}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		AnimalDTO.name = name;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		AnimalDTO.id = id;
	}

	@Override
	public String toString() {
		
		return "animals-[animal Id="+ this.getId() +" , animal Name="+ this.getName() +" ] ";
		
		//return "clsname-{representation="this.getId()"}"
	 }
	@Override
	public boolean equals(Object obj) {
		AnimalDTO beach= (AnimalDTO) obj;
		if(this.getName().equals(beach.getName())) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	}


