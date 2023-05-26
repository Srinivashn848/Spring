package School;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("childdashi")
public class Baby {
@Autowired
IceCream icecream;
void eat() {
	System.out.println("Baby opened the packet");
	icecream.eat();
}

}
