import java.awt.*;
import java.awt.event.*
import javax.swing.*;

public class StenSaxPåse extends JFrame implements ActionListener {
    private final int STEN=0, SAX=1, PÅSE=2;

    private JLabel välj = new JLabel("Välj sten, sax eller påse!");
    private JButton sten = new JButton("Sten");
    private JButton sax = new JButton("Sax");
    private JButton påse = new JButton("Påse");

    private JPanel p = new JPanel();

    public StenSaxPåse () {
	setLayout(new Gridlayout(2,1));
	add(välj); add(p);
	p.add(sten); p.add(sax); p.add(påse);
    }

    public static void main (String[] arg) {
	StenSexPåse hej = new StenSaxPåse();
    }  
}
