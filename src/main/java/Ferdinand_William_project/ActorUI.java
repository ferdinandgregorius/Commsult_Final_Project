package Ferdinand_William_project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Observable;
import java.util.Observer;

public class ActorUI implements Observer {
	
private JLabel window, ac;
    
    public ActorUI() {
        //UI for actor, may be combined with WeatherSensorUI later on
        
        JFrame jframe= new JFrame();
        
        JLabel windowLabel = new JLabel("Window: ");
        windowLabel.setBounds(50, 40, 200, 40);
        
        jframe.add(windowLabel);
        
        window = new JLabel();
        window.setBounds(50, 40, 100, 30);
        jframe.add(window);
        
        JLabel acLabel = new JLabel("AC: ");
        acLabel.setBounds(50, 40, 200, 20);
        
        jframe.add(acLabel);
        
        ac = new JLabel();
        ac.setBounds(50, 40, 100, 10);
        jframe.add(ac);
        
        jframe.setSize(400, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setTitle("Window and AC Status");
    }
    
    @Override
    public void update(Observable actor, Object args) {
    	Actor actor1 = (Actor) actor;
    	
    	window.setText(actor1.getWindowStatus());
    	ac.setText(actor1.getAcStatus());
    }
}
