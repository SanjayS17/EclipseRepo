package classs.com.boot;

import classs.com.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint paint=new Paint("jsw","red",1,350,"box",true,true,2022,2028,true);
		
	    System.out.println(paint);
	    Paint paint1=new Paint("jsw","red",1,400,"box",false,true,2022,2028,true);
	    System.out.println(paint1);
	    
	    boolean wall=paint.equals(paint1);
	    System.out.println(wall);
	    

	}

}
