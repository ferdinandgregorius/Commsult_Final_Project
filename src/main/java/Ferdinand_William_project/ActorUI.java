package Ferdinand_William_project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Observable;
import java.util.Observer;

public class ActorUI implements Observer {
	
private JLabel window, ac;
    
    public ActorUI() {
        
        JFrame jframe= new JFrame();
        
        jframe.setTitle("Window and AC Status");
        jframe.setSize(400, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
        
        JLabel windowLabel = new JLabel("Window: ");
        windowLabel.setBounds(50, 40, 200, 40);
        
        jframe.add(windowLabel);
        
        window = new JLabel("CLOSED");
        window.setBounds(150, 30, 200, 40);
        jframe.add(window);
        
        JLabel acLabel = new JLabel("AC: ");
        acLabel.setBounds(50, 40, 200, 20);
        
        jframe.add(acLabel);
        
        ac = new JLabel("OFF");
        ac.setBounds(150, 40, 200, 50);
        jframe.add(ac);
    }
    
    @Override
    public void update(Observable actor, Object args) {
    	Actor actor1 = (Actor) actor;
    	
    	window.setText(actor1.getWindowStatus());
    	ac.setText(actor1.getAcStatus());
    }
}
