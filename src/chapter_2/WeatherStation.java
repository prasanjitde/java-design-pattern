/**
 * 
 */
package chapter_2;

/**
 * @author prasanjit
 * This class creates a Subject
 * Adds data to it which notifies the observers
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(82, 40, 20f);
	}

}
