package School;

import org.springframework.stereotype.Component;

@Component
public  class Chocolate implements IceCream {
	public void eat()
	{
		System.out.println("Baby eating ci");
	}
}
