/**
 * 
 */
package chapter_1;

/**
 * @author prasanjit
 * This class represents a character and provides a fight method
 * The setWeapon method set the weapon behavior on the fly
 * 
 * This is a STRATEGY pattern
 */
public abstract class Character {
	
	// character HAS-A weapon behavior
	WeaponBehavior weapon;
	
	// abstract method to fight
	protected abstract void fight();
	
	// method to set the weapon behavior on the fly
	// protected as it is required only by the sub classes
	protected void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}

}
