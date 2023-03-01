package com.xworkz.vishu.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.vishu.dto.BeverageDTO;
import com.xworkz.vishu.dto.ChatDTO;
import com.xworkz.vishu.dto.EducationDTO;
import com.xworkz.vishu.dto.FamilyDTO;
import com.xworkz.vishu.dto.MobileDTO;

@Component
@RequestMapping("/")
public class Display {
	
	
	@GetMapping("/em")
	public String onEm(Model model) {
		System.out.println("Running onEm....");
		model.addAttribute("email","mahananda.xworkz@gmail.com");
		return "index.jsp";
		
	}
	
	@GetMapping("/mob")
	public String onMob(Model model) {
		System.out.println("Running onMob....");
		model.addAttribute("phNo",8073421992L);
		return "index.jsp";
		
	}
	
	@GetMapping("/aada")
	public String onAada(Model model) {
		System.out.println("Running onAada....");
		model.addAttribute("aadarNo",789456123078L);
		return "index.jsp";
		
	}
	
	@GetMapping("/ag")
	public String onAg(Model model) {
		System.out.println("Running onAg....");
		model.addAttribute("agee",24);
		return "index.jsp";
		
	}
	
	@GetMapping("/birth")
	public String onBirth(Model model) {
		System.out.println("Running onBirth....");
		int datetime;
		model.addAttribute("birthday",LocalDateTime.of(1999, 02, 16, 12, 30));
		return "index.jsp";
		
	}
	
	@GetMapping("/sal")
	public String onSal(Model model) {
		System.out.println("Running onSal....");
		model.addAttribute("salaryy",40000);
		return "index.jsp";
		
	}
	
	@GetMapping("/frnd")
	public String onFrnd(Model model) {
		System.out.println("Running onFrnd....");
		List<String> ref=new ArrayList<String>();
		ref.add("Bajju");
		ref.add("anni");
		ref.add("snehi");
		ref.add("swati");
		ref.add("pondi");
		model.addAttribute("frnds",ref);
		return "index.jsp";
		
	}
	
	@GetMapping("/visit")
	public String onVisit(Model model) {
		System.out.println("Running onFrnd....");
		List<String> ref=new ArrayList<String>();
		ref.add("xworkz");
		ref.add("saiPG");
		ref.add("Hamunan Temple");
		ref.add("Eskan Temple");
		ref.add("MetrisquareMall");
		model.addAttribute("visite",ref);
		return "index.jsp";
		
	}

	@GetMapping("/skills")
	public String onSkills(Model model) {
		System.out.println("Running onFrnd....");
		List<String> ref=new ArrayList<String>();
		ref.add("Core-java");
		ref.add("Html");
		ref.add("CSS");
		ref.add("Bootstrap");
		ref.add("JavaStript");
		model.addAttribute("skill",ref);
		return "index.jsp";
		
	}
	
	
	@GetMapping("/bvrg")
	public String onDto(Model model) {
		System.out.println("Running onDto");
		BeverageDTO dto =new BeverageDTO();
		dto.setName("cofee");
		dto.setTasty(true);
		dto.setFlavour("cofee");
		dto.setColor("chocalate");
		dto.setBuyer("cofee");
		dto.setCold(true);
		dto.setPrice(100);
		dto.setMadeby("sahana");
		model.addAttribute("dto1",dto);
		return "index.jsp";
		
	}
	
	@GetMapping("/chaty")
	public String onChat(Model model) {
		System.out.println("Running onChat");
		ChatDTO dto =new ChatDTO();
		dto.setAddress("bagalkot");
		dto.setCenterName("annakarmel");
		dto.setId(1);
		dto.setName("annaprasad");
		dto.setNoOfCharts(5);
		dto.setOwner("giddiBaba");
		dto.setOwnerPh(8529637410L);
		dto.setPrice(852);
		dto.setQuantity(2);
		dto.setRanting(5);
		dto.setTasty(true);
		dto.setType("drinking");
		model.addAttribute("dto2",dto);
		return "index.jsp";
		
	}
	
	@GetMapping("/educ")
	public String onEdu(Model model) {
		System.out.println("Running onEdu");
		EducationDTO dto =new EducationDTO();
		dto.setAddress("Bijapur");
		dto.setCgp(8.2);
		dto.setColleageName("BGMIT");
		dto.setFirstName("vishala");
		dto.setLastName("karigoudar");
		dto.setPhNo(8529637410L);
		dto.setQualification("BE");
		dto.setRank(5);
		dto.setSchoolName("MDRS Hebbal");
		dto.setStream("ECE");
		model.addAttribute("ed",dto);
		
		return "index.jsp";
		
	}
	
	
	@GetMapping("/fdto")
	public String onFmly(Model model) {
		System.out.println("Running onFmly");
		FamilyDTO dto =new FamilyDTO();
		dto.setAddressName("Bagalkot");
		dto.setBrotherName("Danesh");
		dto.setFatherName("bhimappa");
		dto.setFatherPh(8524566374L);
		dto.setGrandMother("parvatti");
		dto.setHomeName("Amma");
		dto.setMotherName("shamala");
		dto.setNativePlace("ingalgi");
		dto.setNuberOfSister(3);
		dto.setSisteName("Sanjana");
		model.addAttribute("family",dto);
		
		return "index.jsp";
		
	}
	
	
	@GetMapping("/phs")
	public String onPhone(Model model) {
		System.out.println("Running onPhone");
		MobileDTO dto =new MobileDTO();
		dto.setColor("pink");
		dto.setMobileName("Redmi note");
		dto.setRam(4);
		dto.setShape("Rectangle");
		dto.setVersion(4);
		model.addAttribute("dto4",dto);
		return "index.jsp";
		
	}
	
	
	
	

}
