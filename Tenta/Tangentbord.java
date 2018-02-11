//import java.awt.List.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.util.List.*;
import java.util.*;

//Av någon anledning kan ej listor användas så får använda array...

public class Tangentbord extends JFrame implements ActionListener {
    JLabel textruta = new JLabel("");
    JPanel tangentbord = new JPanel();
    char[] tecken = {'1','2','3','4','5','6','7','8','9','0','+',
		     'Q','W','E','R','T','Y','U','I','O','P','Å',
		     'A','S','D','F','G','H','J','K','L','Ö','Ä',
		     'Z','X','C','V','B','N','M',',','.','-'};
    JButton mellanslag = new JButton(" ");
	

    public Tangentbord() {
	setLayout(new GridLayout(3,1));
	add(textruta); add(tangentbord); add(mellanslag);
	mellanslag.addActionListener(this);

	tangentbord.setLayout(new GridLayout(4,11));
	
	for (int i=0; i<43; i++) {
	    JButton b =new JButton(Character.toString(tecken[i]));
	    b.addActionListener(this);
	    tangentbord.add(b);
	}
	
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

	
    public static void main (String[] arg) {
	new Tangentbord();
    }
    

    public void actionPerformed(ActionEvent e) {
	JButton t = (JButton) e.getSource();
	textruta.setText(textruta.getText() + t.getText());
    }
}
