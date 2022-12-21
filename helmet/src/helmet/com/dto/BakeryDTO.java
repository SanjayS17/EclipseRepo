package helmet.com.dto;

public class BakeryDTO {
	
	private String name;
	private String ownerName;
	private long contactNo;
	private String famousFor;
	private String location;
	
	public BakeryDTO() {
		super();
	}

	public BakeryDTO(String name, String ownerName, long contactNo, String famousFor, String location) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.contactNo = contactNo;
		this.famousFor = famousFor;
		this.location = location;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", contactNo=" + contactNo + ", famousFor="
				+ famousFor + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	


}
