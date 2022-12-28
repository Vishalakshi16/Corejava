package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CalendarRunner {
public static void main(String[] args) {
	CalendarDTO col=new CalendarDTO("Asalicalender","Kannada",2);
	CalendarDTO col1=new CalendarDTO("LaxmiCalender","Telagu",2);
	CalendarDTO col2=new CalendarDTO("BasaveshwaraCalender","Tamil",3);
	CalendarDTO col3=new CalendarDTO("PondiCalender","English",4);
	CalendarDTO col4=new CalendarDTO("giddiCalender","Marati",1);
	
	Collection<CalendarDTO> calender=new ArrayList<CalendarDTO>();
	calender.add(col4);
	calender.add(col3);
	calender.add(col2);
	calender.add(col1);
	calender.add(col);
	
	boolean contain=calender.contains(col4);
	System.out.println(contain);
	
	boolean equal=col.equals(col4);
	System.out.println(equal);
	
	boolean equal1= (col==col1);
	System.out.println(equal1);
	
	
}
}
