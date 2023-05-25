package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Lazy
@Component("childdashi")
@Scope("prototype")
public class Mobile {
//  public Mobile(){
//	  System.out.println("object created");
//  } component is used to create object
//	value is used to intialize values
	@Value("one plus")
	String brand;
	@ Value("8")
	int ram;
	
	
//	@Autowired
//	Jio sim;
//	autowired will go to particular class and gets object and stores in reference varaible
//	Airtel sim;


//	@Override
//	public String toString() {
//		return "Mobile [brand=" + brand + ", ram=" + ram + ", sim=" + sim + "]";
//	}

     
	
//	@Override
//	public String toString() {
//		return "Mobile [brand=" + brand + ", ram=" + ram + ", sim=" + sim + "]";
//	}

//	@Override
//	public String toString() {
//		return "Mobile [brand=" + brand + ", ram=" + ram + "]";
//	}
	
	
	@Autowired
	@Qualifier("jio")
//	 qualifier same as primary but has higher preference
	Sim sim;


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", sim=" + sim + "]";
	}
	
	
}
