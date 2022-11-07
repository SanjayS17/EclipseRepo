package inheritance2.com.things.boot;

import inheritance2.com.things.Cordiologist;
import inheritance2.com.things.Dentist;
import inheritance2.com.things.Doctor;
import inheritance2.com.things.ENT;

public class DoctorRunner {

	private static final ENT Doctor3 = null;

	public static void main(String[] args) {
		
		Doctor doctor1=new Doctor();
		System.out.println(doctor1.name);
		System.out.println(doctor1.salary);
		System.out.println("@@@@@@@@@@@@@@@@@");
		
		Doctor doctor2=new Dentist();
		Dentist dentist=(Dentist)doctor2;//casting 
		System.out.println(dentist.dentistName);
		System.out.println(dentist.salary);
		System.out.println(dentist.name);
		System.out.println(dentist.salary);
		System.out.println("***********************");
		
		Doctor doctor3 =new ENT();
		ENT ent=(ENT) doctor3;
		System.out.println(ent.noOfPatients);
		System.out.println(ent.feez);
		System.out.println(ent.name);
		System.out.println(ent.salary);
		System.out.println("##################");
		
		Doctor doctor4=new Cordiologist();
		Cordiologist cordiologist=(Cordiologist) doctor4;
		System.out.println(cordiologist.noOfDoctors);
		System.out.println(cordiologist.hospitalName);
		System.out.println(cordiologist.name);
		System.out.println(cordiologist.salary);
		System.out.println("$$$$$$$$$$$$$$$$$$4");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
