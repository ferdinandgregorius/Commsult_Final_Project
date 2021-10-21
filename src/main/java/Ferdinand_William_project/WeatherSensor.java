package Ferdinand_William_project;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class WeatherSensor extends Observable {

	double windSpeed;
	double temperature;
	double humidity;
	
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

	public void startWindSpeedSensor() {

		Random rand = new Random();

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					setWindSpeed(100 * rand.nextDouble());
					System.out.println("Wind Speed: " + windSpeed);
					
					if(getWindSpeed()>13.5) {
						actor.setWindowStatus("CLOSED");
					}else {
						actor.setWindowStatus("OPENED");
					}
					
					actor.startWindow();
					
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

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature= temperature;
		setChanged();
		notifyObservers(this);
	}

	public void startTemperatureSensor() {

		Random rand = new Random();

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					setTemperature(100 * rand.nextDouble());
					System.out.println("Temperature: " + temperature);
					
					if(getTemperature()>30.0) {
						actor.setAcStatus("ON");
					}else {
						actor.setAcStatus("OFF");
					}
					
					actor.StartAc();
					
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

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		setChanged();
		notifyObservers(this);
	}

	public void startHumiditySensor() {

		Random rand = new Random();

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					setHumidity(100 * rand.nextDouble());
					System.out.println("Humidity: " + humidity);
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
