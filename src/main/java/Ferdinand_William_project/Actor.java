package Ferdinand_William_project;

import java.util.Observable;
import java.util.Observer;

public class Actor extends Observable{
	
	double windSpeed;
	
	
	public Actor(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	
	public double getWindSpeed() {
		return windSpeed;
	}
	
	public void registerObserver(Observer o) {
		addObserver(o);
	}
	
	public void setWindSpeed(double windSpeed) {
		this.windSpeed=windSpeed;
		setChanged();
		notifyObservers(this);
	}
	
	public void startWindow() {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					if(windSpeed>13.5) {
						System.out.println("Windows: OPEN");
					}else {
						System.out.println("Windows: CLOSED");
					}
				}
			}
		});
		
		thread.start();
	}
	
}
