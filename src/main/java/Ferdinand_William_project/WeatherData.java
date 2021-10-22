package Ferdinand_William_project;

import java.util.ArrayList;

public class WeatherData {

	int secondsPassed;

	double windSpeed;
	double temperature;
	double humidity;

	String windowStatus;
	String acStatus;

	public WeatherData(int secondsPassed, double windSpeed, double temperature, double humidity, String windowStatus, String acStatus) {
		this.secondsPassed = secondsPassed;
		this.windSpeed = windSpeed;
		this.temperature = temperature;
		this.humidity = humidity;
		this.windowStatus = windowStatus;
		this.acStatus = acStatus;
	}
	
	ArrayList<WeatherData> WeatherDataList = new ArrayList<WeatherData>();
	
	
	public void printWeahterData() {
		
		for (int i = 0; i<WeatherDataList.size(); i++) {
			System.out.println("Hours Passed: " + WeatherDataList.get(i).secondsPassed +":00" + ", WindSpeed: " + WeatherDataList.get(i).windSpeed + 
					", Temperature: " + WeatherDataList.get(i).temperature + ", Humidity: " + WeatherDataList.get(i).humidity + 
					", Window Status: " + WeatherDataList.get(i).windowStatus + ", AC Status: " + WeatherDataList.get(i).acStatus);
		}
	}
}
