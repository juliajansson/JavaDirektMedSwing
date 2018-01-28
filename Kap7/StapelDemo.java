import java.awt.*;
import javax.swing.*;

public class StapelDemo extends JFrame {
    public StapelDemo() {
	Stapel s1 = new Stapel(true);
	Stapel s2 = new Stapel(true);
	s1.sättProcent(75);
	s2.sättProcent(33.3);
	setLayout(new GridLayout(1,2));
	add(s1); add(s2);
	setSize(500,1000);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] arg) {
	StapelDemo s = new StapelDemo();
    }
}
