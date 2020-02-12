/**
 * 
 */
package chapter_4;

/**
 * @author prasanjit
 * This is the creator class
 * This class is used to create pizza
 * This class is unaware of the type of pizza it creates
 * The concrete class is the one who decides which type of pizza is created
 * This decouples the code
 * This is Factory Method pattern
 * This factory method is available for the concrete creator classes to create a pizza
 * Pizza is a product which the factory is creating
 *
 */
public abstract class PizzaStore {
	
	protected Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
	
}
