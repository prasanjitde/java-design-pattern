/**
 * 
 */
package chapter_2;

/**
 * @author prasanjit
 * Subject is the publisher in the observer pattern
 * The subject requires observers to implement the Observer interface
 */
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
