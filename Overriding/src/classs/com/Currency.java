package classs.com;

public class Currency {
	private String name;
	private String type;
	private String countryOfOrigion;
	private String Brand;
	private int modelNo;
	private String material;
	private String toyTyp;
	private String color;
	private double height;
	private float width;
	
	public Currency() {
		super();
	}

	public Currency(String name, String type, String countryOfOrigion, String brand, int modelNo, String material,
			String toyTyp, String color, double height, float width) {
		super();
		this.name = name;
		this.type = type;
		this.countryOfOrigion = countryOfOrigion;
		Brand = brand;
		this.modelNo = modelNo;
		this.material = material;
		this.toyTyp = toyTyp;
		this.color = color;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Currency [name=" + name + ", type=" + type + ", countryOfOrigion=" + countryOfOrigion + ", Brand="
				+ Brand + ", modelNo=" + modelNo + ", material=" + material + ", toyTyp=" + toyTyp + ", color=" + color
				+ ", height=" + height + ", width=" + width + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountryOfOrigion() {
		return countryOfOrigion;
	}

	public void setCountryOfOrigion(String countryOfOrigion) {
		this.countryOfOrigion = countryOfOrigion;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getToyTyp() {
		return toyTyp;
	}

	public void setToyTyp(String toyTyp) {
		this.toyTyp = toyTyp;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Currency) {
			Currency cast1=(Currency)obj;
			if(this.Brand.equals(cast1.Brand)&&
					this.color.equals(cast1.color)&&
					this.type.equals(cast1.type)&&
					this.name.equals(cast1.name)) {
				System.out.println("brand color type name is equal");
				return true;
			}
				
			}else {
				System.out.println("brand color type name is not equal");
			}
		return false;
		
	}

}
