package spring_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Car {
	String brand;
	int topspeed;
	SonyMusicSystem musicSystem;
	


public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}

	public SonyMusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(SonyMusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

public Car(){
	System.out.println(" car object is created");
}

@Override
public String toString() {
	return "Car [brand=" + brand + ", topspeed=" + topspeed + ", musicSystem=" + musicSystem + "]";
}






}

