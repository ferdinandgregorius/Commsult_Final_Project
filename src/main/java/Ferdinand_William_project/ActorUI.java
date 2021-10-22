package Ferdinand_William_project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Observable;
import java.util.Observer;

public class ActorUI implements Observer {
	
private JLabel label1, label2;
    
    public ActorUI() {
        
        JFrame jframe= new JFrame();
        
        jframe.setTitle("Window and AC Status");
        jframe.setSize(400, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
        
        JLabel acLabel = new JLabel("AC: ");
        acLabel.setBounds(50, 40, 200, 40);
        
        jframe.add(acLabel);
        
        label1 = new JLabel("CLOSED");
        label1.setBounds(150, 30, 200, 40);
        jframe.add(label1);
        
        JLabel windowLabel = new JLabel("WINDOW: ");
        windowLabel.setBounds(50, 40, 200, 20);
        
        jframe.add(windowLabel);
        
        label2 = new JLabel("OFF");
        label2.setBounds(150, 40, 200, 50);
        jframe.add(label2);
    }
    
    @Override
    public void update(Observable actor, Object args) {
    	Actor actor1 = (Actor) actor;
    	
    	label1.setText(actor1.getWindowStatus());
    	label2.setText(actor1.getAcStatus());
    }
}
