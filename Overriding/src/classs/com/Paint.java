package classs.com;

public class Paint {
    private String brand;
	private String color;
	private int quantity;
	private double price;
	private String type;
	private boolean ecofriendly;
	private boolean quality;
	private long mfgdate;
	private long expdate;
	private boolean oilpaint;
	
	public Paint(String brand, String color, int quantity, double price, String type, boolean ecofriendly,
			boolean quality, long mfgdate, long expdate, boolean oilpaint) {
		super();
		this.brand = brand;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.ecofriendly = ecofriendly;
		this.quality = quality;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
		this.oilpaint = oilpaint;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEcofriendly() {
		return ecofriendly;
	}

	public void setEcofriendly(boolean ecofriendly) {
		this.ecofriendly = ecofriendly;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public long getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(long mfgdate) {
		this.mfgdate = mfgdate;
	}

	public long getExpdate() {
		return expdate;
	}

	public void setExpdate(long expdate) {
		this.expdate = expdate;
	}

	public boolean isOilpaint() {
		return oilpaint;
	}

	public void setOilpaint(boolean oilpaint) {
		this.oilpaint = oilpaint;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", color=" + color + ", quantity=" + quantity + ", price=" + price + ", type="
				+ type + ", ecofriendly=" + ecofriendly + ", quality=" + quality + ", mfgdate=" + mfgdate + ", expdate="
				+ expdate + ", oilpaint=" + oilpaint + "]";
	}
	public boolean equals(Object objt) {
		if(objt instanceof Paint) {
			Paint casted=(Paint)objt;
			if(this.brand.equals(casted.brand)&&this.color.equals(color)) {
				return true;
				
			}
		}
	
	
	else {
		System.out.println("brand is equal");
	}
	return false;
}
	


}
