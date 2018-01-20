import java.awt.*;
import javax.swing.*;

public class Ö9 {
    public static void main (String[] arg) {
	Grafik g = new Grafik();
    }
}

class Grafik extends JFrame {
    public Grafik() {
	JLabel j = new JLabel("Julia Jansson",
			      JLabel.CENTER);
	add(j);
	j.setOpaque(true);
	Color idk = new Color(63,127,255);
	j.setBackground(idk);
	Color swag = new Color(0,0,100);
	j.setForeground(swag);
	j.setFont(new Font("SansSerif", Font.ITALIC, 72));
	setSize(1000,500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
	
