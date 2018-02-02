import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hand extends JFrame {
    JButton knapp = new JButton("Om du flyttar din mus hit, kommer den förändras till en hand. TRYCK PÅ MIG!");

    public Hand() {
	setLayout(new FlowLayout());
	add(knapp);

	knapp.addMouseListener(m);

	setSize(800,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    MouseAdapter m = new MouseAdapter () {
	    public void mousePressed(MouseEvent e) {
		if (e.getComponent() == knapp)
		    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
	    }
	    public void mouseEntered(MouseEvent e) {
		if (e.getComponent() == knapp)
		    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    }
	    public void mouseExited(MouseEvent e) {
		if (e.getComponent() == knapp)
		    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    }
	};

    public static void main (String[] arg) {
	new Hand();;
    }
}
    

