package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//configuration is used to make normal class to config class
@ComponentScan("annotation")
//component scan should be ussed to mention package name of the java file
public class MyConfiguration {
@Bean
public Sim getSim(){
	return  new Airtel();
}
}
