package Ferdinand_William_project;

public class MainRunner {
	public static void main(String[] args) {
		
		//WeatherTimer wt = new WeatherTimer();
		WeatherSensorUI w = new WeatherSensorUI();
		WeatherSensor ws = new WeatherSensor(25, 10, 20);
		
		//wt.start();
		
		ws.registerObserver(w);

		ws.startWeatherSensor();
	}
}
