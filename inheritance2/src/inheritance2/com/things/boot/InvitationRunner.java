package inheritance2.com.things.boot;

import inheritance2.com.things.things2.Marriageinvitation;

public class InvitationRunner {

	public static void main(String[] args) {
		
		
		Marriageinvitation MarriageInvitation=new Marriageinvitation("wedding",123,"red");
		
      System.out.println(MarriageInvitation.color);
      System.out.println(MarriageInvitation.type);
      System.out.println(MarriageInvitation.noOfinvitation);
      
      
	}

}
