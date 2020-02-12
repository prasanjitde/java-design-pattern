/**
 * 
 */
package chapter_2;

import java.util.ArrayList;

/**
 * @author prasanjit
 * This class implements the Subject
 * This class has the state which is used to notify the observers
 * The observer uses this class to observe the subject
 */
public class WeatherData implements Subject{
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(o);
		if(index >= 0) {
			observers.remove(index);
		}
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
