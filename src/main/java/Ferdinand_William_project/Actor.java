package Ferdinand_William_project;

import java.util.Observable;
import java.util.Observer;

public class Actor extends Observable{
	
	String windowStatus;
	String acStatus;
	
	public Actor(String windowStatus, String acStatus) {
		this.windowStatus = windowStatus;
		this.acStatus = acStatus;
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
	
	public String getAcStatus() {
		return acStatus;
	}
	
	public void setAcStatus(String acStatus) {
		this.acStatus = acStatus;
		setChanged();
		notifyObservers(this);
	}
	
	public void startActors() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					
					setWindowStatus(windowStatus);
					setAcStatus(acStatus);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
	}
	
//	public void startWindow() {
//		
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (true) {
//					
//					setWindowStatus(windowStatus);
//					
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		
//		thread.start();
//	}
//	
//public void StartAc() {
//		
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (true) {
//					
//					setAcStatus(acStatus);
//					
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		
//		thread.start();
//	}
	
}
