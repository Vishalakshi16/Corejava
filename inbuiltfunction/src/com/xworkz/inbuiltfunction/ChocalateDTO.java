package com.xworkz.inbuiltfunction;
import com.xworkz.inbuiltfunction.ChocalateDTO;

public class ChocalateDTO {
	
	private  String name;
	private int id;





	public ChocalateDTO() {
		System.out.println(this.getClass().getName());
		}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  int getId() {
		return id;
	}

	public  void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		
		return "chocalates-[chocalates Id="+ this.getId() +" , chocalates Name="+ this.getName() +" ] ";
		
		//return "clsname-{representation="this.getId()"}"
	 }
	@Override
	public boolean equals(Object obj) {
		ChocalateDTO beach= (ChocalateDTO) obj;
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

