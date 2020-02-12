/**
 * 
 */
package chapter_4;

/**
 * @author prasanjit
 * This class uses the creator abstract type to create a product which is a pizza
 *
 */
public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NYPizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("NYCheese");
		System.out.println("Created a " + pizza.getName() + "\n");
		
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Pizza chicagoPizza = chicagoStore.orderPizza("ChicagoVeggie");
		System.out.println("Created a " + chicagoPizza.getName());
	}

}
