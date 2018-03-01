import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.awt.event.*;

//Histogram redan färdigskriven i tentauppg, så inte en del av uppgiften
//Funkar inte... kanske felsöka senare?

public class HistogramDemo extends JFrame implements ActionListener {
    JMenuItem[] mi = {new JMenuItem("Show"), new JMenuItem("Hide"), new JMenuItem("Exit")};
    Histogram h = new Histogram();
    
    public HistogramDemo() {
	JMenuBar mb = new JMenuBar();
	setJMenuBar(mb);
	JMenu amen = new JMenu("Action");
	mb.add(amen);
	for (JMenuItem j : mi) {
	    amen.add(j);
	    j.addActionListener(this);
	}
	
	add(h);

	setSize(320,180);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void clear() {
	setTitle(null);
	remove(h);
	h = new Histogram();
	add(h);
	repaint();
    }
	

    public static void main (String[] args) {
	new HistogramDemo();
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource()==mi[0]) {
	    clear();
	    String s = JOptionPane.showInputDialog("Skriv in namnet på en textfil!");
	    if (s==null)
		return;
	    Scanner sc = null;
	    
	    try {
		sc = new Scanner(new File(s));
	    }
	    catch (FileNotFoundException ex) {
		JOptionPane.showMessageDialog(null, "Filen hittades ej!");
		return;
	    }
	
	    setTitle(s);
	    while (sc.hasNextDouble())
		h.addValue(sc.nextDouble());
	}
	
	else if (e.getSource() == mi[1])
	    clear();
	
	else if (e.getSource() == mi[2])
	    System.exit(0);
    }
    

}

class Histogram extends Stapel {
    List<Stapel> s = new ArrayList<>();
    
    public Histogram() {
	//setLayout(new GridLayout(1,1));
	//setSize(320,180);
	//setVisible(true);
    }

    public Histogram(double[] a) {
	setLayout(new GridLayout(1,a.length));
	for (double d : a) {
	    Stapel i = new Stapel();
	    i.sättProcent(d);
	    s.add(i);
	    add(i);
	}
	    
	setSize(320,180);
	setVisible(true);

       
    }

    public void setValues(double[] a) {
	for (double d : a) {
	    Stapel i = new Stapel();
	    i.sättProcent(d);
	    s.add(i);
	}
    }

    public void addValue(double d) {
	Stapel ny = new Stapel();
	ny.sättProcent(d);
	s.add(ny);
    }

}

class Stapel extends JPanel {
    private double procent;

    public Stapel () {
	procent = 0;
	setForeground(Color.red);
	
    }

    public void sättProcent(double p) {
	procent = p;
	setForeground(Color.red);
	repaint();
	
    }

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(getForeground());
	
	int höjd = (int) (getHeight() * procent/100);
	g.fillRect(0,getHeight()-höjd,getWidth(),höjd);
       
    }
}
