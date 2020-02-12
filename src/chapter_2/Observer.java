/**
 * 
 */
package chapter_2;

/**
 * @author prasanjit
 * Observer requires data from the Subject
 * The update is used to get the data
 *
 */
public interface Observer {
	
	void update(float temperature, float humidity, float pressure);

}
