package com.xwork.app;

public class WiresTester {
	public static void main(String[] args) {
		FinolexWiresDTO dto= new FinolexWiresDTO();
		dto.setId(1);
		dto.setMobileNumber("2345678678");
		dto.setCountryOfOrigin("india");
		dto.setPrice(56);
		dto.setWeight("2 kg 450 gram");
		dto.setManifacturer("finolex");
		dto.setAsin("B56789h");
		System.out.println(dto.getAsin()+" "+ dto.getCountryOfOrigin()+" "+dto.getId()+" "+dto.getMobileNumber+" "+
				dto.getPrice()+" "+dto.getWeight()+" "+dto.getManifacturer());
		
	//	FinolexWiresDTO dto1= new FinolexWiresDTO(1,"2345678678","india",56,"2 kg 450 gram","finolex","B56789h");
		
	}
	

}
