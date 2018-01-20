import java.awt.*;
import javax.swing.*;

public class App extends JApplet {
    puvlic void init() {
	JLabel j = new JLabel("Julia Jansson",
			      JLabel.CENTER);
	add(j);
	l.setOpaque(true);
	l.setBackground(Color.yellow);
	l.setForeground(Color.blue);
	l.setFont(new Font("SansSerif", Font.ITALIC, 30));
    }
}
