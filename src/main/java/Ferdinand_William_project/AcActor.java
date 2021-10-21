package Ferdinand_William_project;

import java.util.Observable;
import java.util.Observer;

public class AcActor extends Observable {
	
	String acStatus;
	
	public AcActor(String acStatus) {
		this.acStatus = acStatus;
	}
	
	public void registerObserver(Observer o) {
		addObserver(o);
	}
	
	public String getAcStatus() {
		return acStatus;
	}
	
	public void setAcStatus(String acStatus) {
		this.acStatus = acStatus;
		setChanged();
		notifyObservers(this);
	}
	
	public void StartAc() {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println("AC: " + acStatus);
				}
			}
		});
	}
}
