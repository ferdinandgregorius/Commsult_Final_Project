package Ferdinand_William_project;

public class MainRunner {
	public static void main(String[] args) {
		
		WeatherSensorUI w = new WeatherSensorUI();

		WeatherSensor ws = new WeatherSensor(25, 10, 20);
		
		ws.registerObserver(w);

		ws.startHumiditySensor();
		ws.startWindSpeedSensor();
		ws.startTemperatureSensor();
		
		String windowStatus, acStatus;
		
		ActorUI au = new ActorUI();
		
		Actor a = new Actor("CLOSED", "OFF");
		
		a.registerObserver(au);
		
		a.startWindow();
		a.StartAc();
	}
}
