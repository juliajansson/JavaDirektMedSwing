import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Simhoppstävling extends JFrame implements ActionListener{
    JPanel övre = new JPanel();
    JPanel undre = new JPanel();
    
    JTextField d1 = new JTextField();
    JTextField d2 = new JTextField();
    JTextField d3 = new JTextField();
    JTextField d4 = new JTextField();
    JTextField d5 = new JTextField();
    JTextField d6 = new JTextField();
    JTextField[] domare = {d1,d2,d3,d4,d5,d6};
    double[] poäng = {0,0,0,0,0,0};

    JLabel l1 = new JLabel("Svårighetsgrad: ");
    JTextField svår = new JTextField();
    JLabel l2 = new JLabel("Hoppets poäng: ");
    JLabel l3 = new JLabel();
    JButton ny = new JButton("Nytt hopp");
    JButton res = new JButton("Beräkna resultat");

    public Simhoppstävling() {
	setLayout(new GridLayout(2,1));
	add(övre); add(undre);

	övre.setLayout(new GridLayout(1,6));
	övre.add(d1); övre.add(d2); övre.add(d3);
	övre.add(d4); övre.add(d5); övre.add(d6);

	undre.setLayout(new GridLayout(1,6));
	undre.add(l1); undre.add(svår);
	undre.add(l2); undre.add(l3);
	undre.add(ny);
	undre.add(res);

	ny.addActionListener(this);
	res.addActionListener(this);

	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == ny) {
	    for (JTextField d : domare)
		d.setText("");
	    l3.setText("");
	    svår.setText("");
	}
	else if (e.getSource() == res) {
	    double nuvarandepoäng;
	    JTextField d;
	    for (int i=0;i<6;i++) {
		d = domare[i];
		nuvarandepoäng = Double.parseDouble(d.getText());
		poäng[i]=nuvarandepoäng;
	    }
	    java.util.Arrays.sort(poäng);
	    double medelvärde = (poäng[1] + poäng[2] + poäng[3] + poäng[4] + poäng[5])/5;
	    double resultat = 3*medelvärde*Double.parseDouble(svår.getText());
	    l3.setText(Double.toString(resultat));
	}
    
    }
    
    public static void main (String[] arg) {
	new Simhoppstävling();
    }
}
