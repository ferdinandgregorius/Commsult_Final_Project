package Ferdinand_William_project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Observable;
import java.util.Observer;

public class WeatherSensorUI implements Observer {

	private JLabel label, label2, label3;

	public WeatherSensorUI() {
		// weatherSensorUI
		JFrame j = new JFrame();
		
		j.setTitle("The Weather Sensor");
		j.setSize(400, 400);
		j.setLayout(null);
		j.setVisible(true);

		JLabel wind = new JLabel("Wind Speed: ");
		wind.setBounds(50, 40, 200, 40);
		j.add(wind);

		label = new JLabel("99999");
		label.setBounds(150, 40, 200, 40);
		j.add(label);

		JLabel temperature = new JLabel("Temperature: ");
		temperature.setBounds(50, 50, 200, 50);
		j.add(temperature);

		label2 = new JLabel("40");
		label2.setBounds(150, 50, 200, 50);
		j.add(label2);

		JLabel humidity = new JLabel("Humidity: ");
		humidity.setBounds(50, 60, 200, 60);
		j.add(humidity);

		label3 = new JLabel("98");
		label3.setBounds(150, 60, 200, 60);
		j.add(label3);
	}

	@Override
	public void update(Observable sensor, Object arg1) {
		WeatherSensor ws = (WeatherSensor) sensor;
		label3.setText(ws.getHumidity() + " humidity");
		label.setText(ws.getWindSpeed() + " speed");
		label2.setText(ws.getTemperature() + " C");
	}
}