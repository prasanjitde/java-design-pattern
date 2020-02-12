/**
 * 
 */
package chapter_1;

/**
 * @author prasanjit
 * This interface provides the abstraction for behavior 
 * Any class which want to provide this behavior needs to implement this
 */
public interface WeaponBehavior {
	
	// interface methods are by default public and abstract
	// hence interface are known as 100% abstract
	void useWeapon();

}
