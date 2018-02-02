import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Knapp extends JFrame {
    JButton knapp = new JButton();

    public Knapp () {
	setLayout(new FlowLayout());
	add(knapp);
	
	knapp.addMouseListener(m);

	setSize(400,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    MouseAdapter m = new MouseAdapter () {
	    public void mouseEntered(MouseEvent e) {
		if (e.getComponent() == knapp)
		    knapp.setBackground(Color.red);
	    }
	    public void mouseExited(MouseEvent e) {
		if (e.getComponent() == knapp)
		    knapp.setBackground(Color.white);
	    }
	};

    public static void main (String[] arg) {
	new Knapp();
    }
}
