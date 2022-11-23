package classs.com;

public class Institution {

	private String name;
	private String owner;
	private String location;
	private String principalName;
	private String instituteDistrict;
	private String Chairman;
	private int since;
	private double fees;
	private long phNo;
	private int pincode;

	public Institution() {
		super();
	}

	public Institution(String name, String owner, String location, String principalName, String instituteDistrict,
			String chairman, int since, double fees, long phNo, int pincode) {
		super();
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.principalName = principalName;
		this.instituteDistrict = instituteDistrict;
		Chairman = chairman;
		this.since = since;
		this.fees = fees;
		this.phNo = phNo;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", owner=" + owner + ", location=" + location + ", principalName="
				+ principalName + ", instituteDistrict=" + instituteDistrict + ", Chairman=" + Chairman + ", since="
				+ since + ", fees=" + fees + ", phNo=" + phNo + ", pincode=" + pincode + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getInstituteDistrict() {
		return instituteDistrict;
	}

	public void setInstituteDistrict(String instituteDistrict) {
		this.instituteDistrict = instituteDistrict;
	}

	public String getChairman() {
		return Chairman;
	}

	public void setChairman(String chairman) {
		Chairman = chairman;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Institution) {
			Institution cast3 = (Institution) obj;
			if (this.location.equals(cast3.location) && 
					this.name.equals(cast3.name) &&
					this.owner.equals(cast3.owner)
					&& this.principalName.equals(cast3.principalName) && 
					this.instituteDistrict.equals(cast3.instituteDistrict)&&
					this.Chairman.equals(cast3.Chairman)) {
				System.out.println("location name owner principalname instistutedistrict chairman id is equal");
				return true;

			}

		} else {

			System.out.println("location name owner principalname instistutedistrict chairman id is not equal");
		}
		return false;
	}

}
