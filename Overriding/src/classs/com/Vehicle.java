package classs.com;

public class Vehicle {
	private String color;
	private String brand;
	private String name;
	private double price;
	private String material;
	private int model;
	private boolean battery;
	private boolean shelpstarter;
	private double weight;
	private float height;

	public Vehicle(String color, String brand, String name, double price, String material, int model, boolean battery,
			boolean shelpstarter, double weight, float height) {
		super();
		this.color = color;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.material = material;
		this.model = model;
		this.battery = battery;
		this.shelpstarter = shelpstarter;
		this.weight = weight;
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public boolean isBattery() {
		return battery;
	}
	public void setBattery(boolean battery) {
		this.battery = battery;
	}
	public boolean isShelpstarter() {
		return shelpstarter;
	}
	public void setShelpstarter(boolean shelpstarter) {
		this.shelpstarter = shelpstarter;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", brand=" + brand + ", name=" + name + ", price=" + price + ", material="
				+ material + ", model=" + model + ", battery=" + battery + ", shelpstarter=" + shelpstarter
				+ ", weight=" + weight + ", height=" + height + "]";
	}
	public boolean equals(Object objt) {
		if(objt instanceof Vehicle ) {
			Vehicle casted=(Vehicle) objt;
			if(this.brand.equals(casted.brand)&&
					this.color.equals(casted.color)) {
				System.out.println("brand and color is equal");
				return true;
			}
		}
		else
		{
			System.out.println("brand and color is not equal");
	
		}
		return false;
		
	}
	
	
}
