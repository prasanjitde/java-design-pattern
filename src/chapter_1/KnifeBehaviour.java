/**
 * 
 */
package chapter_1;

/**
 * @author prasanjit
 * This class implements the WeaponBehaviour interface
 * and provides the actual implementation for the behavior
 * This way we can add any number of behavior without affecting the characters
 */
public class KnifeBehaviour implements WeaponBehavior{

	@Override
	public void useWeapon() {
		// TODO Auto-generated method stub
		System.out.println("Using a knife");
	}

}
