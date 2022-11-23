package classs.com;

public class LipStick {
	


	private String name;
	private String texture;
	private String form;
	private String finish;
	private String color;
	private String countryOrigin;
	private String genericName;
	private String quantity;
	private double price;
	private int duration;
	
	public LipStick() {
		super();
	}

	public LipStick(String name, String texture, String form, String finish, String color, String countryOrigin,
			String genericName, String quantity, double price, int duration) {
		super();
		this.name = name;
		this.texture = texture;
		this.form = form;
		this.finish = finish;
		this.color = color;
		this.countryOrigin = countryOrigin;
		this.genericName = genericName;
		this.quantity = quantity;
		this.price = price;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "LipStick [name=" + name + ", texture=" + texture + ", form=" + form + ", finish=" + finish + ", color="
				+ color + ", countryOrigin=" + countryOrigin + ", genericName=" + genericName + ", quantity=" + quantity
				+ ", price=" + price + ", duration=" + duration + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean equals(Object obj) {
		if(obj instanceof LipStick) {
			LipStick cast5=(LipStick)obj;
			if(this.color.equals(cast5.color)&&
					this.countryOrigin.equals(cast5.countryOrigin)&&
					this.duration==cast5.duration&&
					this.finish.equals(cast5.finish)&&
					this.genericName.equals(cast5.genericName)&&
					this.name.equals(cast5.name)&&
					this.price==cast5.price&&
					this.texture.equals(cast5.texture)) 
			{
				System.out.println("above statements ore true");
				return true;
			}
			
		}else {
			System.out.println("above statements are false");
		}
		return false;
		
	}
	
}
