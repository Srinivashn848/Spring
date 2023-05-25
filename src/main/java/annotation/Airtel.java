package annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Airtel implements Sim{
//if we have more then one implementation class then we have to mention one class has primary
	@Override
	public String toString() {
		return "This is Airtel";
	}

}
