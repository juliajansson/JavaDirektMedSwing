import javax.swing.*;
import java.awt.*;

public class Stapel extends JPanel {
    private double procent;
    private boolean vertikal;

    public Stapel (boolean a) {
	procent = 0;
	vertikal = a;
    }

    public void sättProcent(double p) {
	if (p>=0 && p<=100)
	    procent=p;
	else
	    throw new IllegalArgumentException("Felaktigt procenttal!");
	repaint();
    }

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(getForeground());
	if (vertikal) {
	    int höjd = (int) (getHeight() * procent/100);
	    g.fillRect(0,getHeight()-höjd,getWidth(),höjd);
	}
	else {
	    int bredd = (int) (getWidth() * procent/100);
	    g.fillRect(0,0,bredd,getHeight());
	}
    }
}
