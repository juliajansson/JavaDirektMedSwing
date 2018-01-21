import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Växel extends JFrame implements ActionListener {
    JLabel hurmkt = new JLabel("Hur mycket kostar det?");
    JLabel bet = new JLabel("Vad betalar du?");
    JPanel p1 = new JPanel();
    
    JTextField pris = new JTextField(10);
    JTextField betalat = new JTextField(10);
    JPanel p2 = new JPanel();

    JLabel växel = new JLabel("Växeln är:");
    JLabel hundra = new JLabel("");
    JLabel femtio = new JLabel("");
    JLabel tjugo = new JLabel("");
    JLabel tio = new JLabel("");
    JLabel fem = new JLabel("");
    JLabel en = new JLabel("");
    JPanel p3 = new JPanel();
    

    public Växel () {
	setLayout(new BorderLayout());
	add("West", p1); add("Center", p2); add("South", p3); //fixa detta.
	    
	p1.setLayout(new GridLayout(2,1));
	p1.add(hurmkt); 
	p1.add(bet); 

	p2.setLayout(new GridLayout(2,1));
	p1.add(pris);
	p1.add(betalat);

	//	hurmkt.setLabelFor(pris);
	//bet.setLabelFor(betalat);

	p3.setLayout(new GridLayout(7,1));
	p3.add(växel);
	p3.add(hundra);
	p3.add(femtio);
	p3.add(tjugo);
	p3.add(tio);
	p3.add(fem);
	p3.add(en);

	pris.addActionListener(this);
	betalat.addActionListener(this);

        pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] arg) {
	Växel växel = new Växel();
    }

    public void actionPerformed(ActionEvent e) {
	Scanner sc1 = new Scanner(pris.getText());
	int p = sc1.nextInt();
	Scanner sc2 = new Scanner(betalat.getText());
	int b = sc2.nextInt();
	int t = b-p;
	hundra.setText(t / 100 + " hundralappar");
	t = t % 100;
	femtio.setText(t / 50 + " femtiolappar");
	t = t % 50;
	tjugo.setText(t / 20 + " tjugolappar");
	t = t % 20;
	tio.setText(t / 10 + " tiokronorsmynt");
	t = t % 10;
	fem.setText(t / 5 + " femkronorsmynt");
	t = t % 5;
	en.setText(t + " enkronorsmynt");
    }
}
