/**
 * 
 */
package chapter_3;

/**
 * @author prasanjit
 * The concrete class will provide the cost for the beverage
 */
public class Espresso extends Beverage{
	
	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
