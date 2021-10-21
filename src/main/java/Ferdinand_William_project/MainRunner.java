package Ferdinand_William_project;

public class MainRunner {
	public static void main(String[] args) {
		
		WeatherSensorUI w = new WeatherSensorUI();
		WeatherTimer wt = new WeatherTimer();
		WeatherSensor ws = new WeatherSensor(25, 10, 20);
		
		ws.registerObserver(w);

		ws.startHumiditySensor();
		ws.startWindSpeedSensor();
		ws.startTemperatureSensor();
		
		wt.start();
	}
}
