/**
 * 
 */
package chapter_3;

/**
 * @author prasanjit
 * This is a concrete Decorator class
 * It uses the beverage type (the type which it will decorate) and
 * adds its own cost
 */
public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 0.20;
	}

}
