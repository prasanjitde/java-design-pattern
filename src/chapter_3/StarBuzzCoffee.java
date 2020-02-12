/**
 * 
 */
package chapter_3;

/**
 * @author prasanjit
 *
 */
public class StarBuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// simply take a coffee
		Beverage beverage = new HouseBlend();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// add a decorator to the coffee
		// add a mocha
		// mocha adds its own cost to the cost of the coffee
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}

}
