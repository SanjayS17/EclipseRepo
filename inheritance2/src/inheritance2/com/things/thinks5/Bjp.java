package inheritance2.com.things.thinks5;

public class Bjp  extends PoliticalParty{

	public String cm;
	
	public Bjp(String fund, int noOfCandidates) {
		super(fund, noOfCandidates);
			
	}
	public Bjp(String fund, int noOfCandidates,String cm) {
		this(fund, noOfCandidates);
		this.cm=cm;
	}
	public void display() {
		super.display();
		System.out.println(cm);
		
	}
	

}
