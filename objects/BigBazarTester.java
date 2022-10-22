class BigBazarTester{

     public static void main(String args[]){
	 
	 BigBazar bazar = new BigBazar();
	 bazar.noOfWorkers = 25;
	 bazar.address = "White field";
	 bazar.floors = "4 floors";
	 bazar.brand = "StarBeam";
	 bazar.manager = "Sneha";
	 bazar.toGetItems();
	 System.out.println(bazar.noOfWorkers + " "+ bazar.address + " "+ bazar.floors + " "+ bazar.brand + " "+ bazar.manager);
	 
	 BigBazar bazar1 = new BigBazar();
	 bazar1.noOfWorkers = 50;
	 bazar1.address = "Mejestic";
	 bazar1.floors = "7 floors";
	 bazar1.brand = "Nature Bell";
	 bazar1.manager = "Mahananda";
	 bazar1.toGetItems();
	 System.out.println(bazar1.noOfWorkers + " "+ bazar1.address + " "+ bazar1.floors + " "+ bazar1.brand + " "+ bazar1.manager);
	 
	 BigBazar bazar2 = new BigBazar();
	 bazar2.noOfWorkers = 35;
	 bazar2.address = "Banashankari";
	 bazar2.floors = "3 floors";
	 bazar2.brand = "Feelmax";
	 bazar2.manager = "Annakarmel";
	 bazar2.toGetItems();
	 System.out.println(bazar2.noOfWorkers + " "+ bazar2.address + " "+ bazar2.floors + " "+ bazar2.brand + " "+ bazar2.manager);
	 
	 
	 
	 
	 
	 }




}