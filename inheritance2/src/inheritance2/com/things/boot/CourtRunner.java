package inheritance2.com.things.boot;

import inheritance2.com.things.Court;
import inheritance2.com.things.DistrictCourt;
import inheritance2.com.things.HighCourt;
import inheritance2.com.things.Supremecourt;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court=new Court();
		System.out.println(court.name);
		System.out.println(court.noOflowyer);
		System.out.println("@@@@@@@@@@@@@@@");
		
		Court court1=new HighCourt();
        HighCourt high=(HighCourt) court1;
        System.out.println(high.Lowyername);
        System.out.println(high.caseFeez);
        System.out.println(high.name);
        System.out.println(high.noOflowyer);
        System.out.println("#################");
        
        Court court2=new Supremecourt();
        Supremecourt supremecourt=(Supremecourt)court2;
        System.out.println(supremecourt.judgeName);
        System.out.println(supremecourt.judgeage);
        System.out.println(supremecourt.name);
        System.out.println(supremecourt.noOflowyer);
        System.out.println("$$$$$$$$$$$$$$$$$$$$4");
        
        Court court3=new DistrictCourt();
        DistrictCourt districtCourt=(DistrictCourt) court3;
        System.out.println(districtCourt.casenumber);
        System.out.println(districtCourt.casename);
        System.out.println(districtCourt.name);
        System.out.println(districtCourt.noOflowyer);
        System.out.println("&&&&&&&&&&&&&&&&&&&&");
        
         
	}

}
