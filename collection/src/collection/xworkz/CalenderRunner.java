package collection.xworkz;

import java.util.ArrayList;
import java.util.Collection;

public class CalenderRunner {
 
	public static void main(String[] args) {


		CalenderDTO calendarDTO1 = new CalenderDTO ("wallCalendar", 12, "Groupon");
		CalenderDTO calendarDTO2 = new CalenderDTO ("deskCalendar", 12, "Influitive");
		CalenderDTO calendarDTO3 = new CalenderDTO ("tableCalendar", 12, "Spinfluence");
		CalenderDTO calendarDTO4 = new CalenderDTO ("googleCalendar", 12, "Omnilert");
		CalenderDTO calendarDTO5 = new CalenderDTO ("wallCalendar", 12, "Technologent");
		
		boolean equals =  calendarDTO1.equals( calendarDTO5);
		System.out.println(equals);
		
		Collection< CalenderDTO>  calendars = new ArrayList< CalenderDTO>();
		calendars.add( calendarDTO1);
		calendars.add( calendarDTO2);
		
		boolean contains = calendars.contains( calendarDTO5);
		System.out.println("contains "+contains);
	}

}
