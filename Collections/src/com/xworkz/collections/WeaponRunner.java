package com.xworkz.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weapon1=new WeaponDTO("stick","danesh",LocalDate.of(1999, 10, 20),3300,Type.silver);
		WeaponDTO weapon2=new WeaponDTO("knief","chaitu",LocalDate.of(1998, 11, 30) ,4330,Type.gold);
		WeaponDTO weapon3=new WeaponDTO("blade","sanju",LocalDate.of(1980, 12, 21) ,440,Type.plastic);
		WeaponDTO weapon4=new WeaponDTO("lance","vishu",LocalDate.of(1989, 8, 20) ,440,Type.iron);
		WeaponDTO weapon5=new WeaponDTO("halberd","shwetu",LocalDate.of(1899, 10, 20) ,600,Type.silver);
		WeaponDTO weapon6=new WeaponDTO("ax","bajju",LocalDate.of(1889, 10, 20) ,990,Type.gold);
		WeaponDTO weapon7=new WeaponDTO("sword","anita",LocalDate.of(1899, 10, 20) ,460,Type.silver);
		WeaponDTO weapon8=new WeaponDTO("spear","akshata",LocalDate.of(2000, 10, 20) ,900,Type.gold);
		WeaponDTO weapon9=new WeaponDTO("club","swati",LocalDate.of(2000, 10, 20) ,1200,Type.silver);
		WeaponDTO weapon10=new WeaponDTO("pike","sneha",LocalDate.of(2001, 1, 22) ,490,Type.plastic);
		WeaponDTO weapon11=new WeaponDTO("harpoon","manu",LocalDate.of(2002, 1, 21) ,800,Type.gold);
		WeaponDTO weapon12=new WeaponDTO("grenade","annu",LocalDate.of(2003, 2, 22) ,700,Type.silver);
		WeaponDTO weapon13=new WeaponDTO("bolo","muskan",LocalDate.of(2004, 3, 23) ,600,Type.plastic);
		WeaponDTO weapon14=new WeaponDTO("pike","sahana",LocalDate.of(2005, 4, 24) ,5600,Type.gold);
		WeaponDTO weapon15=new WeaponDTO("missel","shubba",LocalDate.of(2006, 5, 25) ,3300,Type.silver);
		WeaponDTO weapon16=new WeaponDTO("rocket","hani",LocalDate.of(2007, 6, 26) ,200,Type.plastic);
		WeaponDTO weapon17=new WeaponDTO("rifle","shilpa",LocalDate.of(2008, 7, 27) ,100,Type.gold);
		WeaponDTO weapon18=new WeaponDTO("tanks","ashu",LocalDate.of(2009, 8, 28) ,400,Type.silver);
		WeaponDTO weapon19=new WeaponDTO("revolver","bisu",LocalDate.of(2010, 9, 29) ,500,Type.plastic);
		WeaponDTO weapon20=new WeaponDTO("land mines","jyoti",LocalDate.of(2020, 10, 20) ,900,Type.silver);
		
		Collection<WeaponDTO> col=new ArrayList();
		Set<WeaponDTO> weaponDTO=Stream.of(weapon1,weapon2,weapon3,weapon4,weapon5,weapon6,weapon7,weapon8,
				weapon9,weapon10,
				weapon11,weapon12,weapon13,weapon14,weapon15,
				weapon16,weapon17,weapon18,weapon19,
	            weapon20).collect(Collectors.toSet());
		
		weaponDTO.stream()
		.map((e)->{
			if(e.getPrice()>500)
				return e;
			return "NA";
			})
		.collect(Collectors.toSet())
		.forEach((e)->{System.out.println(e);});
	
		/*weaponDTO.stream()
		.map((e)->{
			if(e.getMadeby() && e.getMadeon())
				return e;
			return "NA";
			})
		.collect(Collectors.toSet())
		.forEach((e)->{System.out.println(e);});*/
		
		
		System.out.println("sort below by name");
		Comparator<WeaponDTO> comparator1=((p1,p2)->p1.getName().compareTo(p2.getName()));
		
		weaponDTO.stream().sorted(comparator1).forEach(e->System.out.println(e));
		
		System.out.println("sort below by price asc**************************************");
		Comparator<WeaponDTO> comparator2=((p1,p2)->Integer.compare(p1.getPrice(),p2.getPrice()));
		
		weaponDTO.stream().sorted(comparator2).forEach(e->System.out.println(e));
		
		
		System.out.println("sort below by price des****************************");
		Comparator<WeaponDTO> comparator3=((p1,p2)->Integer.compare(p2.getPrice(),p1.getPrice()));
		
		weaponDTO.stream().sorted(comparator3).forEach(e->System.out.println(e));
		
		
		System.out.println("sort below by madeby asc****************************");
		Comparator<WeaponDTO> comparator4=((p1,p2)->p1.getMadeby().compareTo(p2.getMadeby()));
		
		weaponDTO.stream().sorted(comparator4).forEach(e->System.out.println(e));
		
		System.out.println("sort below by madeby des****************************");
		Comparator<WeaponDTO> comparator5=((p1,p2)->p2.getMadeby().compareTo(p1.getMadeby()));
		
		weaponDTO.stream().sorted(comparator5).forEach(e->System.out.println(e));
		
		
		System.out.println("sort below by madeon asc****************************");
		Comparator<WeaponDTO> comparator6=((p1,p2)->p1.getMadeon().compareTo(p2.getMadeon()));
		
		weaponDTO.stream().sorted(comparator6).forEach(e->System.out.println(e));
		
		
		System.out.println("sort below by madeon des****************************");
		Comparator<WeaponDTO> comparator7=((p1,p2)->p2.getMadeon().compareTo(p1.getMadeon()));
		
		weaponDTO.stream().sorted(comparator7).forEach(e->System.out.println(e));
	}
}
