package Ferdinand_William_project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Observable;
import java.util.Observer;

public class WeatherSensorUI implements Observer {

	private JLabel value, value2, value3;

	public WeatherSensorUI() {
		// wind speed UI
		JFrame j = new JFrame();

		JLabel wind = new JLabel("Wind Speed: ");
		wind.setBounds(50, 40, 200, 40);
		j.add(wind);

		value = new JLabel("99999");
		value.setBounds(150, 40, 200, 40);
		j.add(value);

		j.setSize(400, 400);
		j.setLayout(null);
		j.setVisible(true);
		j.setTitle("The Weather Sensor");

		JLabel temperature = new JLabel("Temperature: ");
		temperature.setBounds(50, 50, 200, 50);
		j.add(temperature);

		value2 = new JLabel("40");
		value2.setBounds(150, 50, 200, 50);
		j.add(value2);

		j.setSize(400, 400);
		j.setLayout(null);
		j.setVisible(true);

		JLabel humidity = new JLabel("Humidity: ");
		humidity.setBounds(50, 60, 200, 60);
		j.add(humidity);

		value3 = new JLabel("98");
		value3.setBounds(150, 60, 200, 60);
		j.add(value3);

		j.setSize(400, 400);
		j.setLayout(null);
		j.setVisible(true);
	}

	@Override
	public void update(Observable sensor, Object arg1) {
		WeatherSensor ws = (WeatherSensor) sensor;
		value3.setText(ws.getHumidity() + " humidity");
		value.setText(ws.getWindSpeed() + " speed");
		value2.setText(ws.getTemperature() + " C");
	}
}