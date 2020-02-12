/**
 * 
 */
package chapter_4;

/**
 * @author prasanjit
 * This is a concrete product
 * This product creation is decided by the concrete creator classes 
 */
public class NYCheesePizza extends Pizza{
	
	public NYCheesePizza() {
		name = "NY style cheese pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
