/**
 * 
 */
package chapter_2;

/**
 * @author prasanjit
 * This is an observer
 * It registers itself to a Subject
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float temp;
	private float humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions is temperature " + temp + ", humidity " + humidity );
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temperature;
		this.humidity = humidity;
		display();
	}

}
