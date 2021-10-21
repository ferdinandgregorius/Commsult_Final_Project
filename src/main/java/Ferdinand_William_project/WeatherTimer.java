package Ferdinand_William_project;

import java.util.Timer;
import java.util.TimerTask;

public class WeatherTimer {
	int secondsPassed = 0;
	Timer wTimer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
			System.out.print("Hours passed: " + secondsPassed + ", ");
		}
	};

	public void start() {
		wTimer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
}
