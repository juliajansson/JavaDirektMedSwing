import java.awt.*;
import javax.swing.*;

public class App extends JApplet {
    public void init() {
	JLabel j = new JLabel("Julia Jansson",
			      JLabel.CENTER);
	add(j);
	j.setOpaque(true);
	j.setBackground(Color.yellow);
	j.setForeground(Color.blue);
	j.setFont(new Font("SansSerif", Font.ITALIC, 30));
    }
}
