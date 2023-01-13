package com.xworkz.autoWiredd.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.autoWiredd.bean.Item;

@Configuration
@ComponentScan("com.xworkz.autoWiredd")
public class ItemConfiguration {

	public ItemConfiguration() {
		System.out.println("created item configuration");
	}
	@Bean
	public Item material() {
		System.out.println("register item with spring");
		Item it=new Item();
		it.setName("glass");
		return it;
	}
	
	@Bean
	public String softwareEngineerr() {
		System.out.println("reg software enginerr with spring");
		String ref=new String("softWareEngineer");
		return ref;
	}
	
	@Bean
	public int noOfYearss() {
		System.out.println("reg software enginerr with spring");
		int ref=10;
		return ref;
	}
	
	@Bean
	public int idValue() {
		System.out.println("register id  with spring ");
		return 2;
	}
	//////////////////////////////////////////////////
	@Bean
	public String hdName() {
		System.out.println("register name with spring");
		return "laxmi";
	}
	
	@Bean
	public int hdGstNum() {
		System.out.println("register name with spring");
		return 20;
	}
	
	@Bean
	public String hdOwnerNamee() {
		System.out.println("register name with spring");
		return "maha";
	}
	
	@Bean
	public String hdAddresss() {
		System.out.println("register name with spring");
		return "mudhol";
	}
	
	@Bean
	public int hdId() {
		System.out.println("register name with spring");
		return 2;
	}
	//////////////////////////////////////////////////////////////////////////
	@Bean
	public String nameOfGovt() {
		System.out.println("registering name..");
		return "BJP";
	}
	
	@Bean
	public String presidentnamee() {
		System.out.println("registering president name..");
		return "NarendrMOdi";
	}
	
	@Bean
	public double tenuree() {
		System.out.println("registering tenuree...");
		return 6.0;
	}
	
	@Bean
	public int memberss() {
		System.out.println("registerinng members..");
		return 215;
	}
	
	@Bean
	public boolean majorityy() {
		System.out.println("registering majority...");
		return true;
	}
	////////////////////////////////////////////////////////////////////
	@Bean
	public String werName() {
		System.out.println("registering name..");
		return "BJP";
	}
	
	@Bean
	public double werVersion() {
		System.out.println("register name with spring");
		return 20.0;
	}
	
	@Bean
	public String werDeveloper() {
		System.out.println("registering name..");
		return "BJP";
	}
	
	@Bean
	public LocalDate werDate() {
		System.out.println("registering name..");
		return LocalDate.of(1999, 10, 21);
	}
	
	@Bean
	public boolean werFree() {
		System.out.println("registering name..");
		return true;
	}
	
	@Bean
	public String sftName() {
		System.out.println("registering name..");
		return "Bajju";
	}

	
	@Bean
	public String sftCompanyName() {
		System.out.println("registering name..");
		return "capgemini";
	}

	
	@Bean
	public long sftSalary() {
		System.out.println("register name with spring");
		return 40000L;
	}
	
	@Bean
	public int sftExperience() {
		System.out.println("register name with spring");
		return 2;
	}
	/////////////////////////////////////////////////////////
	@Bean
	public String pencilName() {
		System.out.println("registering pencilname..");
		return "apsara";
	}
	
	@Bean
	public String pencilType() {
		System.out.println("registering type..");
		return "led";
	}
	
	@Bean
	public String pencilColor() {
		System.out.println("registering color..");
		return "pink";
	}
	
	@Bean
	public boolean stolenPencil() {
		System.out.println("registering stolen...");
		return true;
	}
	
	@Bean
	public boolean sharpePencil() {
		System.out.println("registering sharpe...");
		return true;
	}
	
	@Bean
	public int priceOfPencil() {
		System.out.println("registering price..");
		return 10;
	}
	
	///////////////////////////////////////////////////////////////////////
	
	@Bean
	public String rubberName() {
		System.out.println("registering Rubbername..");
		return "apsara";
	}
	
	@Bean
	public String rubberType() {
		System.out.println("registering typeRubber..");
		return "led";
	}
	
	@Bean
	public String rubberColor() {
		System.out.println("registering coloRubberr..");
		return "pink";
	}
	
	@Bean
	public boolean stolenRubber() {
		System.out.println("registering stolenRubber...");
		return true;
	}
	
	@Bean
	public boolean sharpeRubber() {
		System.out.println("registering sharpeRubber...");
		return true;
	}
	
	@Bean
	public int priceOfRubber() {
		System.out.println("registering sharpeRubber...");
		return 10;
	}
	
	


}
