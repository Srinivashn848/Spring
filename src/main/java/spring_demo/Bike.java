package spring_demo;

public class Bike {
	String brand;
	int cc;
	public Bike(String brand, int cc) {
		super();
		this.brand = brand;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", cc=" + cc + "]";
	}
	public Bike() {
		super();
		this.brand=brand;
		this.cc=cc;
	}
	
	
	
}
