import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StenSaxPåse extends JFrame implements ActionListener {
    private final int STEN=0, SAX=1, PÅSE=2;
    private int antalFörlorade;
    private int antalVunna;

    private JLabel välj = new JLabel("Välj sten, sax eller påse!");
    private JButton sten = new JButton("Sten");
    private JButton sax = new JButton("Sax");
    private JButton påse = new JButton("Påse");

    private JPanel p = new JPanel();

    public StenSaxPåse () {
	setLayout(new GridLayout(2,1));
	add(välj); add(p);
	p.add(sten); p.add(sax); p.add(påse);

	sten.addActionListener(this);
	sax.addActionListener(this);
	påse.addActionListener(this);
	
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] arg) {
	StenSaxPåse hej = new StenSaxPåse();
    }

    public void actionPerformed(ActionEvent e) {
	int a = (int) (Math.random() * 3);
	int b;
	
	if (e.getSource()==sten)
	    b=0;
	else if (e.getSource()==sax)
	    b=1;
	else
	    b=2;
	
	String s;
	int res = vinner(a,b);
	if (res == -1) {
	    s="Du förlorade.";
	    antalFörlorade++;
	}
	else if (res == 0)
	    s="Oavgjort.";
	else {
	    s="Du vann!";
	    antalVunna++;
	}

	String antal = String.format("%d matcher vunna, %d matcher förlorade.", antalVunna, antalFörlorade);
	
	JOptionPane.showMessageDialog(null, s + " " + antal);
	
    }

    public static int vinner (int a, int b) {
    	int resultat;
	if (a==b)
	    resultat = 0;
	else if (a==(b+1))
	    resultat = 1;
	else if (a==0 && b==2)
	    resultat = 1;
	else
	    resultat = - vinner(b,a);
	return resultat;
    }

}
