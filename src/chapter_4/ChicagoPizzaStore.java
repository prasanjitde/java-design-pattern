/**
 * 
 */
package chapter_4;

/**
 * @author prasanjit
 *
 */
public class ChicagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("ChicagoVeggie")) {
			return new ChicagoVeggiePizza();
		}
		return null;
	}

}
