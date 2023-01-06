package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams {
	public static void main(String[] args) {
		Collection<String> damsInKarnataka = new ArrayList<String>();
		damsInKarnataka.add("Almatti Dam");
		damsInKarnataka.add("Basava Sagara Dam");
		damsInKarnataka.add("Raja Lakhamagowda dam");
		damsInKarnataka.add("Renuka Sagara Dam");
		damsInKarnataka.add("Vani Vilasa Sagara");
		damsInKarnataka.add("Upper Tunga Dam");
		damsInKarnataka.add("Bhadra Dam");
		damsInKarnataka.add("Tungabhadra Dam");
		damsInKarnataka.add("Hemavathi Reservoir");
		damsInKarnataka.add("Kabini Reservoir");
		damsInKarnataka.add("Harangi Reservoir");
		System.out.println("Size of dams in Karnataka : " + damsInKarnataka.size());
		
		Collection<String> damsInKerala = new ArrayList<String>();
		damsInKerala.add("Banasura Sagar Dam");
		damsInKerala.add("Mattupetty Dam");
		damsInKerala.add("Idukki Dam");
		damsInKerala.add("Malampuzha Garden and Dam");
		damsInKerala.add("Maniyar");
		damsInKerala.add("Chulliyar");
		damsInKerala.add("Chenkulam");
		damsInKerala.add("Cheruthoni");
		damsInKerala.add("Chimmini");
		damsInKerala.add("Erattayar");
		damsInKerala.add("Gavi");
		damsInKerala.add("Idamalayar");
		damsInKerala.add("Kakki");
		System.out.println("Size of dams in Kerala : " + damsInKerala.size());
		
		Collection<String> damsInTamilNadu = new ArrayList<String>();
		damsInTamilNadu.add("Aathupalayam Dam");
		damsInTamilNadu.add("Adavinainar Dam");
		damsInTamilNadu.add("Aliyar Reservoir");
		damsInTamilNadu.add("Amaravathi Dam");
		damsInTamilNadu.add("Anaikuttam Dam");
		damsInTamilNadu.add("Karuppanadhi Dam");
		damsInTamilNadu.add("Kodaganar Dam");
		damsInTamilNadu.add("Kodiveri Dam");
		damsInTamilNadu.add("Krishnagiri Dam");
		damsInTamilNadu.add("Kunderipallam Dam");
		damsInTamilNadu.add("Kuppanatham Dam");
		System.out.println("Size of dams in TamilNadu : " + damsInTamilNadu.size());
		
		
		Collection<String> damsInAndhraPradesh = new ArrayList<String>();
		damsInAndhraPradesh.add("Ahobilam / Penna Ahobilam (Dr. K.S.P.A.B.R.) Dam");
		damsInAndhraPradesh.add("Akkapalem Dam");
		damsInAndhraPradesh.add("Alaganoor Dam");
		damsInAndhraPradesh.add("Ananthasagarm Dam");
		damsInAndhraPradesh.add("Andhra Dam");
		damsInAndhraPradesh.add("Arniar Dam");
		damsInAndhraPradesh.add("Bahuda Dam");
		damsInAndhraPradesh.add("Bhairavanithippa Dam");
		damsInAndhraPradesh.add("Bhupathipalem Dam");
		damsInAndhraPradesh.add("Buggavagu Dam");
		damsInAndhraPradesh.add("Buggavanka Dam");
		damsInAndhraPradesh.add("Bukkapatnam Dam");
		damsInAndhraPradesh.add("Chagallu Barrage Dam");
		damsInAndhraPradesh.add("Cheyyeru / Annamayya Dam");
		System.out.println("Size of dams in AndhraPradesh : " + damsInAndhraPradesh.size());

		
		Collection<String> damsInTelangana = new ArrayList<String>();
		damsInTelangana.add("Ada Village - Peddavagu");
		damsInTelangana.add("Akkampalli");
		damsInTelangana.add("Bandlavagu, Kukkalgudur");
		damsInTelangana.add("Bazarthathnur");
		damsInTelangana.add("Bethampudi");
		damsInTelangana.add("Bheemanpally");
		damsInTelangana.add("Boath");
		damsInTelangana.add("Boggulavagu");
		damsInTelangana.add("Chelamelavagu");
		damsInTelangana.add("Choutaplly Hanuman Reddy Lift");
		damsInTelangana.add("Dantakani Cheruvu");
		damsInTelangana.add("Devathlacheru, Yeldurthy");
		damsInTelangana.add("Dindi");
		damsInTelangana.add("Fox Sagar, Jeedimetla ");
		System.out.println("Size of dams in Telangana : " + damsInTelangana.size());
		
		Collection<String> damsInGoa = new ArrayList<String>();
		damsInGoa.add("Anjunam");
		damsInGoa.add("M.I.");
		damsInGoa.add("Salaulim");
		System.out.println("Size of dams in Goa : " + damsInGoa.size());

		
		Collection<String> damsInGujarat = new ArrayList<String>();
		damsInGujarat.add("Aamli Chharchhoda");
		damsInGujarat.add("Abhalwad");
		damsInGujarat.add("Adhia");
		damsInGujarat.add("Adhochhani");
		damsInGujarat.add("Adhoi- I");
		damsInGujarat.add("Adpur");
		damsInGujarat.add("Advana");
		damsInGujarat.add("Aji I");
		damsInGujarat.add("Aji II");
		damsInGujarat.add("Aji III");
		damsInGujarat.add("Aji IV");
		damsInGujarat.add("Ajwa");
		damsInGujarat.add("Alan Sagar");
		damsInGujarat.add("Amalwant");
		System.out.println("Size of dams in Gujarat : " + damsInGujarat.size());
		
		Collection<String> damsInChhattisgarh = new ArrayList<String>();
		damsInChhattisgarh.add("Tandula");
		damsInChhattisgarh.add("Dudhawa");
		damsInChhattisgarh.add("Gangrel");
		damsInChhattisgarh.add("Kherkatta Reservoir");
		damsInChhattisgarh.add("Murrum Silli");
		damsInChhattisgarh.add("Sondur");
		damsInChhattisgarh.add("Hasdeo Bango");
		damsInChhattisgarh.add("Adpather");
		damsInChhattisgarh.add("Agariya");
		damsInChhattisgarh.add("Ajabnagar");
		damsInChhattisgarh.add("Usaritola");
		damsInChhattisgarh.add("Tanjara");
		System.out.println("Size of dams in Chhattisgarh : " + damsInChhattisgarh.size());
		
		Collection<String> damsInArunachalPradesh = new ArrayList<String>();
		damsInArunachalPradesh.add("Ranganadi Dam");
		damsInArunachalPradesh.add("Subansiri Lower HE Dam");
		System.out.println("Size of dams in ArunachalPradesh : " + damsInArunachalPradesh.size());
		
		Collection<String> damsInNagaland = new ArrayList<String>();
		damsInNagaland.add("Hep Dam");
		System.out.println("Size of dams in Nagaland : " + damsInNagaland.size());

		Collection<String> damsInManipur = new ArrayList<String>();
		damsInManipur.add("Khoupum Dam");
		damsInManipur.add("Khuga Dam");
		damsInManipur.add("Singda Dam");
		damsInManipur.add("Thoubal Dam");
		System.out.println("Size of dams in Manipur : " + damsInManipur.size());

		Collection<String> damsInMizoram = new ArrayList<String>();
		damsInMizoram.add("Serlui B Dam ");
		damsInMizoram.add("Tuirial Dam");
		System.out.println("Size of dams in Mizoram : " + damsInMizoram.size());

		Collection<String> damsInAssam = new ArrayList<String>();
		damsInAssam.add("Karbi Langpi Dam");
		damsInAssam.add("Umrong Dam");
		System.out.println("Size of dams in Assam : " + damsInAssam.size());

		Collection<String> damsInMeghalaya = new ArrayList<String>();
		damsInMeghalaya.add("Khandong Dam");
		damsInMeghalaya.add("Kyrdemkulai Dam");
		damsInMeghalaya.add("Mawphlang Dam");
		damsInMeghalaya.add("Myntdu-Leshka Dam");
		damsInMeghalaya.add("Nongkhyllem Dam");
		damsInMeghalaya.add("Umiam Dam");
		damsInMeghalaya.add("Umtru Dam");
		System.out.println("Size of dams in Meghalaya : " + damsInMeghalaya.size());

		Collection<String> damsInTripura = new ArrayList<String>();
		damsInTripura.add("Gumti Hydro Dam");
		System.out.println("Size of dams in Tripura : " + damsInTripura.size());

		Collection<String> damsInWestBengal = new ArrayList<String>();
		damsInWestBengal.add("Bakreshwar Dam");
		damsInWestBengal.add("Bandhu Dam");
		damsInWestBengal.add("Bara Mandira Dam");
		damsInWestBengal.add("Barabhum Dam");
		damsInWestBengal.add("Beko Dam");
		damsInWestBengal.add("Dangrajhore Dam");
		damsInWestBengal.add("Dimu Dam");
		damsInWestBengal.add("Futiary Dam");
		damsInWestBengal.add("Golamarajore Dam");
		damsInWestBengal.add("Hanumata Dam");
		damsInWestBengal.add("Hinglow Irrigation Scheme Dam");
		damsInWestBengal.add("Kangsabati Kumari Dam");
		damsInWestBengal.add("Kanjan Dam");
		damsInWestBengal.add("Karrior Dam");
		damsInWestBengal.add("Khairabera Dam");
		
		System.out.println("Size of dams in WestBengal : " + damsInWestBengal.size());

		Collection<String> damsInSikkim = new ArrayList<String>();
		damsInSikkim.add("Rangit III Dam");
		damsInSikkim.add("Rangpo Dam");
		damsInSikkim.add("Rongli Dam");
		damsInSikkim.add("Teesta -V (NHPC) Dam");
		damsInSikkim.add("Teesta-III Dam");
		damsInSikkim.add("Teesta-IV Dam");
		System.out.println("Size of dams in Sikkim : " + damsInSikkim.size());

		Collection<String> damsInBihar = new ArrayList<String>();
		damsInBihar.add("Ajan Dam");
		damsInBihar.add("Amrity Dam");
		damsInBihar.add("Badua Dam");
		damsInBihar.add("Barnar Dam");
		damsInBihar.add("Baskund Dam");
		damsInBihar.add("Belharna Dam");
		damsInBihar.add("Bilasi Dam");
		damsInBihar.add("Chandan Dam");
		damsInBihar.add("Durgawati Dam");
		damsInBihar.add("Gaighat Dam");
		damsInBihar.add("Jalkund Dam");
		damsInBihar.add("Job Dam");
		damsInBihar.add("Kailash Ghati Dam");
		damsInBihar.add("Khargpur Lake Dam");
		damsInBihar.add("Kohira Dam");
		System.out.println("Size of dams in Bihar : " + damsInBihar.size());

		Collection<String> damsInJharkhand = new ArrayList<String>();
		damsInJharkhand.add("Amanat Dam");
		damsInJharkhand.add("Anjanwa Dam");
		damsInJharkhand.add("Anraj Dam");
		damsInJharkhand.add("Baksa/Buksa Dam");
		damsInJharkhand.add("Bandha Dam");
		damsInJharkhand.add("Baranadi Dam");
		damsInJharkhand.add("Barhi Dam");
		damsInJharkhand.add("Basuki Dam");
		damsInJharkhand.add("Batane Dam");
		damsInJharkhand.add("Batre Dam");
		damsInJharkhand.add("Bhairwa Dam");
		damsInJharkhand.add("Bhavnikhand Khand Dam");
		damsInJharkhand.add("Bhutanduba Dam");
		damsInJharkhand.add("Bucha Opa Dam");
		damsInJharkhand.add("Burhai Dam");
		damsInJharkhand.add("Icha Dam");
		damsInJharkhand.add("Jaipur Dam");
		
		
		System.out.println("Size of dams in Jharkhand : " + damsInJharkhand.size());

		Collection<String> damsInOdisha = new ArrayList<String>();
		damsInOdisha.add("Alubani Dam");
		damsInOdisha.add("Aradei Dam");
		damsInOdisha.add("Arikul Dam");
		damsInOdisha.add("Badabandha Dam");
		damsInOdisha.add("Badanalla Dam");
		damsInOdisha.add("Badjore Dam");
		damsInOdisha.add("Baghalati Dam");
		damsInOdisha.add("Baghjharan Dam");
		damsInOdisha.add("Baghua Dam");
		damsInOdisha.add("Baghua (MI) Dam");
		damsInOdisha.add("Balaskumpa Dam");
		damsInOdisha.add("Balimela Dam");
		damsInOdisha.add("Bankabal Dam");
		
		
		System.out.println("Size of dams in Odisha : " + damsInOdisha.size());
		
		
		
		
		
		
		
		
		
		Collection<String> damsInIndia = new ArrayList<String>();
		damsInIndia.addAll(damsInKarnataka);
		damsInIndia.addAll(damsInKerala);
		damsInIndia.addAll(damsInTamilNadu);
		damsInIndia.addAll(damsInAndhraPradesh);
		damsInIndia.addAll(damsInTelangana);
		damsInIndia.addAll(damsInGoa);
		damsInIndia.addAll(damsInGujarat);
		damsInIndia.addAll(damsInChhattisgarh);
		damsInIndia.addAll(damsInArunachalPradesh);
		damsInIndia.addAll(damsInNagaland);
		damsInIndia.addAll(damsInManipur);
		damsInIndia.addAll(damsInMizoram);
		damsInIndia.addAll(damsInAssam);
		damsInIndia.addAll(damsInMeghalaya);
		damsInIndia.addAll(damsInTripura);
		damsInIndia.addAll(damsInWestBengal);
		damsInIndia.addAll(damsInSikkim);
		damsInIndia.addAll(damsInBihar);
		damsInIndia.addAll(damsInJharkhand);
		damsInIndia.addAll(damsInOdisha);
		
		
		System.out.println(damsInIndia);
		
		
		for(String dams : damsInIndia) {
			System.out.println(dams);
		}
		
		//*************************************************88
		boolean contains =damsInIndia.contains("P");
		System.out.println("contains p"+contains);
		
		boolean contains1=damsInIndia.contains("Bankabal Dam");
		System.out.println("contains Bankabal"+contains1);
		
		boolean contains2 =damsInIndia.contains("vishala");
		System.out.println("contains vishala"+contains2);
		
		//*****************************************************
		boolean removed=damsInIndia.remove("Bankabal");
		System.out.println(removed);
		
		
		//*****************************************************
		Iterator<String>  dms = damsInIndia.iterator();
		System.out.println("****************element start with B***********************");
		while(dms.hasNext()) {
			String element1=dms.next();

			if(element1.startsWith("B")) {
				
				System.out.println(element1);
			}
		}
		
		//****************************************************************
		Iterator<String>  dms1 = damsInIndia.iterator();
		System.out.println("****************element ends with a***********************");
		while(dms1.hasNext()) {
			String element2=dms1.next();

			if(element2.endsWith("a")) {
				
				System.out.println(element2);
			}
		}
		
		
	}


	}


