import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class F extends JFrame {
    JButton överst = new JButton("Uppe");
    JTextField första = new JTextField("Skriv här");
    JButton nederst = new JButton("Nere");

    public F () {
	addWindowListener(w);
	
	setLayout(new BorderLayout());
	add(överst, BorderLayout.NORTH);
	add(första, BorderLayout.CENTER);
	add(nederst, BorderLayout.SOUTH);
	
	första.addFocusListener(f);

	setSize(300,150);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);      
    }

    WindowAdapter w = new WindowAdapter() {
	    public void windowActivated(WindowEvent e) {
		första.requestFocus();
	    }
	};
    
    FocusAdapter f = new FocusAdapter() {
	    public void focusGained(FocusEvent e) {
		if (e.getComponent() == första)
		    första.setBackground(Color.blue);
	    }
	    public void focusLost(FocusEvent e) {
		if (e.getComponent() == första)
		    första.setBackground(Color.white);
	    }
	};

    public static void main (String[] arg) {
	new F();
    }
}
