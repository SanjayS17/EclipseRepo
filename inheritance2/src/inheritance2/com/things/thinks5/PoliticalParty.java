package inheritance2.com.things.thinks5;

public class PoliticalParty {
	public String fund;
	public int noOfCandidates;
	
	
	public PoliticalParty(String fund, int noOfCandidates) {
		super();
		this.fund = fund;
		this.noOfCandidates = noOfCandidates;
	}
	
	public void display() {
		System.out.println(this.fund);
		System.out.println(this.noOfCandidates);
		
	}
	
	
	
	

}
