package classs.com;

public class Hospital {

	private String name;
	private String location;
	private String doctorName;
	private String doctorGender;
	private String type;
	private String hospitalTaluk;
	private String hospitalDistrict;
	private int pincode;
	private long phNo;
	private int noOfNurses;
	
	public String getName() {
		return name;
	}

	public Hospital(String name, String location, String doctorName, String doctorGender, String type,
			String hospitalTaluk, String hospitalDistrict, int pincode, long phNo, int noOfNurses) {
		super();
		this.name = name;
		this.location = location;
		this.doctorName = doctorName;
		this.doctorGender = doctorGender;
		this.type = type;
		this.hospitalTaluk = hospitalTaluk;
		this.hospitalDistrict = hospitalDistrict;
		this.pincode = pincode;
		this.phNo = phNo;
		this.noOfNurses = noOfNurses;
	}

	
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", doctorName=" + doctorName + ", doctorGender="
				+ doctorGender + ", type=" + type + ", hospitalTaluk=" + hospitalTaluk + ", hospitalDistrict="
				+ hospitalDistrict + ", pincode=" + pincode + ", phNo=" + phNo + ", noOfNurses=" + noOfNurses + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHospitalTaluk() {
		return hospitalTaluk;
	}

	public void setHospitalTaluk(String hospitalTaluk) {
		this.hospitalTaluk = hospitalTaluk;
	}

	public String getHospitalDistrict() {
		return hospitalDistrict;
	}

	public void setHospitalDistrict(String hospitalDistrict) {
		this.hospitalDistrict = hospitalDistrict;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public int getNoOfNurses() {
		return noOfNurses;
	}

	public void setNoOfNurses(int noOfNurses) {
		this.noOfNurses = noOfNurses;
	}

	public Hospital() {
		super();
	}
	public boolean equals(Object obj) {
		if(obj instanceof Hospital) {
			Hospital cast4=(Hospital)obj;
			if(this.doctorGender.equals(cast4.doctorGender)&&
					this.doctorName.equals(cast4.doctorName)&&
					this.hospitalDistrict.equals(cast4.hospitalDistrict)&&
					this.hospitalTaluk.equals(cast4.hospitalTaluk)&&
					this.location.equals(cast4.location)&&
					this.name.equals(cast4.name)) {
				System.out.println("String properties are equal");
				return true;
			}
		}else {
			System.out.println("string properties are not equal");
		}
		return false;
	}

	
}
