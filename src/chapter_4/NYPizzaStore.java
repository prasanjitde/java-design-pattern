/**
 * 
 */
package chapter_4;

/**
 * @author prasanjit
 * This is a concrete creator classes
 * This class in encapsulated with the creation of the products using the factory method provided by the creator abstract class
 */
public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("NYCheese")) {
			return new NYCheesePizza();
		}
		return null;
	}

}
