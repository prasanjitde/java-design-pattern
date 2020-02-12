/**
 * 
 */
package chapter_1;

/**
 * @author prasanjit
 * Using the STRATEGY pattern
 */
public class CharacterSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating a super type reference so that the user (CharacterSimulator) 
		// will have the option to use any character he wants
		// king in this case
		Character character = new King();
		character.fight();
		
		// setting the weapon on the fly
		character.setWeapon(new AxeBehavior());
		character.fight();
		
	}

}
