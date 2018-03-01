import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;

public class Femton extends JFrame implements ActionListener {
    Ruta[] knappar = new Ruta[16];
    Ruta tomruta = new Ruta();

    public Femton() {
	setLayout(new GridLayout(4,4));
	
	    for (int i = 0; i<=15; i++) { 
		Ruta knapp  = new Ruta(i / 4, i % 4, 15-i);
		knappar[i]=knapp;
		add(knapp);
		knapp.addActionListener(this);
	    }
	tomruta = knappar[15];

	setSize(400,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
	Ruta klick = (Ruta) e.getSource();
	String s = klick.getText();

	if ((Math.abs(tomruta.kol - klick.kol) +
	     Math.abs(tomruta.rad - klick.rad)) == 1) {
	    tomruta.setText(klick.getText());
	    klick.setText("");
	    tomruta = klick;
	}
	else
	    System.out.println("NEJ!");
	    
    }

    public static void main(String[] arg) {
	new Femton();
    }
}



class Ruta extends JButton {
    int rad;
    int kol;

    public Ruta() {
    }

    public Ruta(int r, int k, int t) {
       	rad = r;
	kol = k;
	if (t == 0)
	    this.setText("");
	else
	    this.setText(Integer.toString(t));

    }
}
