package stream;

import java.io.Serializable;

public class PalaceDTO implements Serializable {
	
	 private String name;
	 private String location;
	 private String buildBy;
	 private boolean destroyed;
	 private double fee;
	 
	public PalaceDTO() {
		super();
	}

	public PalaceDTO(String name, String location, String buildBy, boolean destroyed, double fee) {
		super();
		this.name = name;
		this.location = location;
		this.buildBy = buildBy;
		this.destroyed = destroyed;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", buildBy=" + buildBy + ", destroyed="
				+ destroyed + ", fee=" + fee + "]";
	}
	

	public String getName() {
		return name;
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

	public String getBuildBy() {
		return buildBy;
	}

	public void setBuildBy(String buildBy) {
		this.buildBy = buildBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	 
	 
	

}
