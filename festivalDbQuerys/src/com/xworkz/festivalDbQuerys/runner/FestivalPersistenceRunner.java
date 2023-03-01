package com.xworkz.festivalDbQuerys.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festivalDbQuerys.entity.FestivalEntity;

public class FestivalPersistenceRunner {
	
	public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.festival");
	EntityManager manager= factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
	FestivalEntity entity1=new FestivalEntity("deepavalli","karnatak",2,"KobariHolgi","laxmi");
	
	FestivalEntity entity2=new FestivalEntity("sankranti","AP",3,"Laddu","ganga");

	FestivalEntity entity3=new FestivalEntity("saraswati","TN",4,"Ladu","laxmi");

	FestivalEntity entity4=new FestivalEntity("laxmipooja","RJ",5,"Sajka","shiva");
	FestivalEntity entity5=new FestivalEntity("christamas","Kashmir",6,"Shira","MahaNandi");
	
	
	FestivalEntity entity6=new FestivalEntity("ramazan","Jammu",7,"Kadabbu","Ganesh");
	FestivalEntity entity7=new FestivalEntity("shivaratri","kanyakumari",8,"ShabudaniKir","shanmuk");

	FestivalEntity entity8=new FestivalEntity("GouriGanesh","MH",10,"Rasgula","Parvatti");

	FestivalEntity entity9=new FestivalEntity("GaneshChatirti","Goa",2,"Modak","Ganga");

	FestivalEntity entity10=new FestivalEntity("WaterDay","Hariyan",9,"juice","Durga");

	
	
	
	FestivalEntity entity11=new FestivalEntity("Bakrid","WB",1,"Madli","chamunddi");
	FestivalEntity entity12=new FestivalEntity("EdMeelad","Tripura",2,"Biryani","Lingu");
	FestivalEntity entity13=new FestivalEntity("RamaJanmastrami","manipur",6,"Balusha","Kalidevi");
	FestivalEntity entity14=new FestivalEntity("NeeruJayati","odisa",5,"Kesaribath","Vishala");
	FestivalEntity entity15=new FestivalEntity("KrishnaJanmastrami","UP",2,"sweetBath","Gouri");

	
	FestivalEntity entity16=new FestivalEntity("GoodFriday","Uttarkhanda",7,"Shankarpale","vishnu");
	FestivalEntity entity17=new FestivalEntity("Holi","Nagalanda",5,"kajjukatri","brahma");
	FestivalEntity entity18=new FestivalEntity("Dasar","Telangan",2,"Chapatti","Sarswavati");
	FestivalEntity entity19=new FestivalEntity("KannadaRajostan","China",6,"Chocalate","Bramha");
	FestivalEntity entity20=new FestivalEntity("RoseDay","pakistan",11,"Genasu","Yamuna");
	
	
	FestivalEntity entity21=new FestivalEntity("TeachersDay","Bangladesh",9,"Holgi","Tunga");
	FestivalEntity entity22=new FestivalEntity("ChildrenDay","shreelanka",6,"Gammun","Kaveri");
	FestivalEntity entity23=new FestivalEntity("GandiJayanti","Jarkanda",12,"surkurma","Eshwara");
	FestivalEntity entity24=new FestivalEntity("independent","WestBengal",22,"paysa","GAnesh");
	FestivalEntity entity25=new FestivalEntity("republic","UttaPradesh",9,"jahangirr","Shankar");

	transaction.begin();
      manager.persist(entity1);
    manager.persist(entity2);
    manager.persist(entity3);
    manager.persist(entity4);
    manager.persist(entity5);
    manager.persist(entity6);
    manager.persist(entity7);
    manager.persist(entity8);
    manager.persist(entity9);
    manager.persist(entity10);
    manager.persist(entity11);
    manager.persist(entity12);
    manager.persist(entity13);
    manager.persist(entity14);
    manager.persist(entity15);
    manager.persist(entity16);
    manager.persist(entity17);
	manager.persist(entity18);
	manager.persist(entity19);
	manager.persist(entity20);
	manager.persist(entity21);
	manager.persist(entity22);
	manager.persist(entity23);
	manager.persist(entity24);
	manager.persist(entity25);
    
      transaction.commit();

	}
	

}
