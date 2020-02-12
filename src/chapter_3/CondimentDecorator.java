/**
 * 
 */
package chapter_3;

/**
 * @author prasanjit
 * This is the base decorator class
 * This class extends the base class type for decorating the object
 * The decorator pattern extends the same type which it decorates
 */
public abstract class CondimentDecorator extends Beverage{
	
	public abstract String getDescription();

}
