package com.xworkz.collections;

import java.util.TreeSet;

public class Currency {
	
		public static void main(String[] args) {
			String Currency1="Afghani";
			String Currency2="Lek";
			String Currency3="Dinar";
			String Currency4="Euro";
			String Currency5="Kwanza";
			String Currency6="East Caribbean dollar";
			String Currency7="Peso";
			String Currency8="Dram";
			String Currency9="Australian dollar";
			String Currency10="Manat";
			String Currency11="Bahamian dollar";
			String Currency12="Taka";
			String Currency13="Barbados dollar";
			String Currency14="Belorussian ruble";
			String Currency15="CFA Franc";
			String Currency16="Ngultrum";
			String Currency17="Boliviano";
			String Currency18="Pula";
			String Currency19="Real";
			String Currency20="Lev";
			String Currency21="Riel";
			String Currency22="Franc";
			String Currency23="Colón";
			String Currency24="Euro";
			String Currency25="Koruna";
			String Currency26="Birr";

			TreeSet<String> collection=new TreeSet<String>();
			
			collection.add(Currency1);
			collection.add(Currency2);
			collection.add(Currency3);
			collection.add(Currency4);
			collection.add(Currency5);
			collection.add(Currency6);
			collection.add(Currency7);
			collection.add(Currency8);
			collection.add(Currency9);
			collection.add(Currency10);
			collection.add(Currency11);
			collection.add(Currency12);
			collection.add(Currency13);
			collection.add(Currency14);
			collection.add(Currency15);
			collection.add(Currency16);
			collection.add(Currency17);
			collection.add(Currency18);
			collection.add(Currency19);
			collection.add(Currency20);
			
			collection.add(Currency21);
			collection.add(Currency22);
			collection.add(Currency23);
			collection.add(Currency24);
			collection.add(Currency25);
			collection.add(Currency26);
			
			
			
			collection.add("dollar");
			
			System.out.println(collection.size());
			
			collection.clear();
			System.out.println("after clear......");
		    System.out.println(collection.size());
			
			
			
		    
			
			

			
		}

	


}
