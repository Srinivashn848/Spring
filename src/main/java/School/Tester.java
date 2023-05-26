package School;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import School.Baby;
import School.MyConfig;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Baby baby=(Baby)context.getBean("childdashi");
		baby.eat();
}
}