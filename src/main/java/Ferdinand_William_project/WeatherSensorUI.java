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
		value.setBounds(50, 100, 200, 30);
		j.add(value);

		j.setSize(400, 400);
		j.setLayout(null);
		j.setVisible(true);
		j.setTitle("My Wind Speed Sensor");

		// temperature UI
		JFrame g = new JFrame();

		JLabel temperature = new JLabel("Temperature: ");
		temperature.setBounds(50, 40, 200, 40);
		g.add(temperature);

		value2 = new JLabel("40");
		value2.setBounds(50, 100, 200, 30);
		g.add(value2);

		g.setSize(400, 400);
		g.setLayout(null);
		g.setVisible(true);
		g.setTitle("My Temperature sensor");

		// humidity UI
		JFrame f = new JFrame();

		JLabel humidity = new JLabel("Humidity: ");
		humidity.setBounds(50, 40, 200, 40);
		f.add(humidity);

		value3 = new JLabel("98");
		value3.setBounds(50, 100, 200, 30);
		f.add(value3);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("My Humidity sensor");
	}

	@Override
	public void update(Observable sensor, Object arg1) {
		WeatherSensor ws = (WeatherSensor) sensor;
		value3.setText(ws.getHumidity() + " humidity");
		value.setText(ws.getWindSpeed() + " speed");
		value2.setText(ws.getTemperature() + " C");
	}
}