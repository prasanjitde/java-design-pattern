/**
 * 
 */
package chapter_3;

/**
 * @author prasanjit
 * This class is used as the base for the decorator
 * Only the type is inherited from the base class by the decorator
 * 
 */
public abstract class Beverage {

	public String description = "default beverage";
	
	public abstract double cost();
	
	public String getDescription() {
		return description;
	}
}
