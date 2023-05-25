package spring_demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
public static void main(String[] args) {
//	ClassPathResource resource=new ClassPathResource("spring_demo/MyConfiguration.xml");
//BeanFactory factory= new XmlBeanFactory(resource);
//Car car=(Car)factory.getBean("car");
//System.out.println(car);
//Bike bike=(Bike) factory.getBean("bike");
//System.out.println(bike);

//ApplicationContext context=new ClassPathXmlApplicationContext("spring_demo/MyConfiguration.xml");
//Car car=(Car) context.getBean("car");
//System.out.println(car);
//Car car2=(Car) context.getBean("car");
//System.out.println(car2);
	
//	ClassPathResource resource=new ClassPathResource("spring_demo/MyConfiguration.xml");
//	BeanFactory factory= new XmlBeanFactory(resource);
//     Car car=(Car) factory.getBean("car"); this is known as lazy loading of bean factory 
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring_demo/MyConfiguration.xml");
//	Car car=(Car) context.getBean("car"); to make application context we have to give lazy-init true in xml file
//	Bike bike=(Bike) context.getBean("bike"); application will be lazy if we have scope =prototype 
//	System.out.println(bike);
//	Bike bike2=(Bike) context.getBean("bike");
//	System.out.println(bike2);
	
//	Car car=(Car) context.getBean("car");
//	System.out.println(car);
	
//	ref for injecting object
//	
Car car=(Car) context.getBean("car");
System.out.println(car);

Bike bike=(Bike) context.getBean("bike");
System.out.println(bike);


}
}
