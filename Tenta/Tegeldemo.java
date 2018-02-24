import java.awt.*;
import javax.swing.*;

public class Tegeldemo extends JFrame {

    public Tegeldemo () {
	Tegelvägg t = new Tegelvägg(100,40);
	setLayout(new GridLayout(1,1));
	add(t);
	
	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    public static void main (String[] args) {
	new Tegeldemo();
    }
}

class Tegelvägg extends JPanel {
    private int bredd;
    private int höjd;

    public Tegelvägg (int b, int h) {
	bredd = b;
	höjd = h;
	setBackground(Color.yellow);
    }

    public void paintComponent (Graphics g) {
	super.paintComponent(g);
	int width = getWidth();
	int height = getHeight();

	for (int rad = 0; rad*höjd<height; rad++) {
	    int rest = rad % 3; //Anger udda eller jämn rad
	    int förskjutning = -rest*bredd/3;
	    for (int kol = 0; kol*bredd+förskjutning<width; kol++)
		g.drawRect(kol*bredd + förskjutning,rad*höjd,bredd,höjd);
	}
	
    }
}
