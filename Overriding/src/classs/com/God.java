package classs.com;

public class God {

	private String name;
	private String gender;
	private String priestName;
	private String location;
	private String templeName;
	private int entryFees;
	private boolean powerfull;
	private int noOfPriests;
	private int noOfVisitors;
	private boolean openMorning;

	public God() {
		super();
	}

	public God(String name, String gender, String priestName, String location, String templeName, int entryFees,
			boolean powerfull, int noOfPriests, int noOfVisitors, boolean openMorning) {
		super();
		this.name = name;
		this.gender = gender;
		this.priestName = priestName;
		this.location = location;
		this.templeName = templeName;
		this.entryFees = entryFees;
		this.powerfull = powerfull;
		this.noOfPriests = noOfPriests;
		this.noOfVisitors = noOfVisitors;
		this.openMorning = openMorning;
	}

	@Override
	public String toString() {
		return "God [name=" + name + ", gender=" + gender + ", priestName=" + priestName + ", location=" + location
				+ ", templeName=" + templeName + ", entryFees=" + entryFees + ", powerfull=" + powerfull
				+ ", noOfPriests=" + noOfPriests + ", noOfVisitors=" + noOfVisitors + ", openMorning=" + openMorning
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPriestName() {
		return priestName;
	}

	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTempleName() {
		return templeName;
	}

	public void setTempleName(String templeName) {
		this.templeName = templeName;
	}

	public int getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

	public boolean isPowerfull() {
		return powerfull;
	}

	public void setPowerfull(boolean powerfull) {
		this.powerfull = powerfull;
	}

	public int getNoOfPriests() {
		return noOfPriests;
	}

	public void setNoOfPriests(int noOfPriests) {
		this.noOfPriests = noOfPriests;
	}

	public int getNoOfVisitors() {
		return noOfVisitors;
	}

	public void setNoOfVisitors(int noOfVisitors) {
		this.noOfVisitors = noOfVisitors;
	}

	public boolean isOpenMorning() {
		return openMorning;
	}

	public void setOpenMorning(boolean openMorning) {
		this.openMorning = openMorning;
	}

	public boolean equals(Object obj) {
		if (obj instanceof God) {
			God cast2 = (God) obj;
			if (this.priestName.equals(cast2.priestName) && this.gender.equals(gender) && this.location.equals(location)
					&& this.name.equals(name) && this.templeName.equals(templeName)) {
				System.out.println("priestName gender location name templeName is equal");
				return true;
			}
		} else {
			System.out.println("priestName gender location name templeName is not equal");
		}
		return false;

	}

}
