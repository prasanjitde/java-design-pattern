/**
 * 
 */
package chapter_1;

/**
 * @author prasanjit
 * This class represents a character hence extending the Character class
 * and it needs to provide the fight
 */
public class King extends Character{
	
	// this will set the default weapon behavior
	public King() {
		// TODO Auto-generated constructor stub
		weapon = new KnifeBehaviour();
	}

	@Override
	protected void fight() {
		// TODO Auto-generated method stub 
		weapon.useWeapon();
	}

}
