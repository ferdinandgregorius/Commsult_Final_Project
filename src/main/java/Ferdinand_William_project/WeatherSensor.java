package Ferdinand_William_project;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class WeatherSensor extends Observable {

	double windSpeed;
	double temperature;
	double humidity;
	
	WeatherTimer weatherTimer = new WeatherTimer();
	
	ActorUI actorUI = new ActorUI();
	Actor actor = new Actor("CLOSED", "OFF");

	public WeatherSensor(double windSpeed, double temperature, double humidity) {
		this.windSpeed = windSpeed;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void registerObserver(Observer o) {
		addObserver(o);
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
		setChanged();
		notifyObservers(this);
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature= temperature;
		setChanged();
		notifyObservers(this);
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		setChanged();
		notifyObservers(this);
	}

	public void startWeatherSensor() {

		Random rand = new Random();

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				weatherTimer.start();
				while (true) {
					
					setWindSpeed(100 * rand.nextDouble());
					
					if(getWindSpeed()>13.5) {
						actor.setWindowStatus("CLOSED");
					}else {
						actor.setWindowStatus("OPENED");
					}
					
					setTemperature(100 * rand.nextDouble());
					
					if(getTemperature()>30.0) {
						actor.setAcStatus("ON");
					}else {
						actor.setAcStatus("OFF");
					}
					
					actor.registerObserver(actorUI);
					actor.startActors();
					
					setHumidity(100 * rand.nextDouble());
					
					WeatherData weatherData = new WeatherData(weatherTimer.getSecondsPassed(),windSpeed, temperature, humidity, actor.getWindowStatus(), actor.getAcStatus());
		
					weatherData.WeatherDataList.add(weatherData);
					weatherData.printWeahterData();
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}
}
