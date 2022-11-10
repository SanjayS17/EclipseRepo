package inheritance2.com.things.things4;

public class DjParty extends Dj {
	public DjParty() {
		System.out.println("creating default constructor of djparty class");
		
	}

	public DjParty(String djName,int noOfDjs,long Price) {
		super(djName,noOfDjs,Price);
		
	}
}

