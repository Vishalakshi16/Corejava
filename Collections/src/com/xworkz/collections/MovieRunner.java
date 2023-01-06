package com.xworkz.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieRunner {
	public static void main(String[] args) {
		
		Collection<MovieDTO> col=new LinkedList();
		MovieDTO dto1=new MovieDTO("kgf2","Kannada",200,LocalDate.of(2021, 02, 15),500);
		MovieDTO dto2=new MovieDTO("Avatar","english",500,LocalDate.of(2022, 12, 25),700);
		MovieDTO dto3=new MovieDTO("Gattimel","Kannada",800,LocalDate.of(1989, 8, 15),900);
		MovieDTO dto4=new MovieDTO("Arya","Telagu",700,LocalDate.of(1889, 8, 15),200);
		MovieDTO dto5=new MovieDTO("asqui2","Hindi",250,LocalDate.of(2000, 9, 25),270);
		
		Set<MovieDTO> movieDTOs=Stream.of(dto1,dto2,dto3,dto4,dto5).
				collect(Collectors.toSet());
		
		System.out.println("sort below by name");
		movieDTOs.stream().sorted().forEach(e->System.out.println(e));
		
		//System.out.println("sorted below by name");
		Comparator<MovieDTO> comparator=((p1,p2)->Double.compare(p1.getBudget(),p2.getBudget()));
		System.out.println("sorted budget by asc");
		
		
		movieDTOs.stream().sorted(comparator).forEach(e->System.out.println(e));
		
		System.out.println("sorted below by Language");
		Comparator<MovieDTO> comparator1=((p1,p2)->p1.getLanguage().compareTo(p2.getLanguage()));
		movieDTOs.stream().sorted().forEach(e->System.out.println(e));
		
	}

}
