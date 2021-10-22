package Ferdinand_William_project;

import java.util.Timer;
import java.util.TimerTask;

public class WeatherTimer {
	int secondsPassed = 0;
	
	public void WeahterTimer(int secondsPassed) {
		this.secondsPassed=secondsPassed;
	}
	
	public int getSecondsPassed() {
		return secondsPassed;
	}
	
	public void setSecondsPassed(int secondsPassed) {
		this.secondsPassed = secondsPassed;
	}
	
	Timer wTimer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
		}
	};

	public void start() {
		wTimer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
}
