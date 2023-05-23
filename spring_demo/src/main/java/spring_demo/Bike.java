package spring_demo;

public class Bike {
	String brand;
	int cc;
	MusicSystem musicsystem;
	public Bike(String brand, int cc, MusicSystem musicsystem) {
		super();
		this.brand = brand;
		this.cc = cc;
		this.musicsystem = musicsystem;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", cc=" + cc + ", musicsystem=" + musicsystem + "]";
	}
	
	
	
}
