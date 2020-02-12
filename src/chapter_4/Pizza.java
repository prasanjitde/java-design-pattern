/**
 * 
 */
package chapter_4;

import java.util.ArrayList;

/**
 * @author prasanjit
 * This is the product in the factory method pattern
 * This class is extended by the product concrete classes
 *
 */
public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();

	protected void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding sauce... ");
		System.out.println("Adding toppings:");
		for(String s: toppings) {
			System.out.println(" " + s);
		}
	}
	
	protected void bake() {
		System.out.println("Started baking...");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza...");
	}
	
	protected void box() {
		System.out.println("Pizza has been boxed.");
	}
	
	public String getName() {
		return name;
	}
}
