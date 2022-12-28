package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class GameRunner {
	public static void main(String[] args) {
		GameDTO gameDto=new GameDTO("Kabaddi","outdoor",7);
		GameDTO gameDto1=new GameDTO("chowkabar","Indoor",4);
		GameDTO gameDto2=new GameDTO("khookhoo","outdoor",12);
		GameDTO gameDto3=new GameDTO("vallyball","outdoor",7);
		GameDTO gameDto4=new GameDTO("chess","Indoor",2);
		
		boolean equals=	gameDto.equals(gameDto1);
		System.out.println(equals);
		
		Collection<GameDTO> col=new ArrayList<GameDTO>();
		col.add(gameDto4);
		col.add(gameDto3);
		col.add(gameDto2);
		col.add(gameDto1);
		col.add(gameDto);
		
		
		boolean contains=col.contains(gameDto4);
		System.out.println(contains);
		
		boolean equals1=	gameDto1.equals(gameDto4);
		System.out.println(equals1);
	}

}
