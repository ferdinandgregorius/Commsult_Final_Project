package Ferdinand_William_project;

import java.util.Observable;
import java.util.Observer;

public class WindowActor extends Observable{
	
	String windowStatus;
	
	public WindowActor(String windowStatus) {
		this.windowStatus = windowStatus;
	}
	
	public void registerObserver(Observer o) {
		addObserver(o);
	}
	
	public String getWindowStatus() {
		return windowStatus;
	}
	
	public void setWindowStatus(String windowStatus) {
		this.windowStatus = windowStatus;
		setChanged();
		notifyObservers(this);
	}
	
	public void startWindow() {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println("Window: " + windowStatus);
				}
			}
		});
		
		thread.start();
	}
	
}
