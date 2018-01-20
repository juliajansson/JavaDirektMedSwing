
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bensin extends JFrame implements ActionListener {
    JTextField årets = new JTextField(10);
    JTextField förra = new JTextField(10);
    JTextField förbrukning = new JTextField(10);
    JLabel l1 = new JLabel("Vad är mätarställningen idag?", JLabel.CENTER);
    JLabel l2 = new JLabel("Vad var mätarställningen förra året?", JLabel.CENTER);
    JLabel l3 = new JLabel("Vad är bensinförbrukningen?", JLabel.CENTER);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel kördamil = new JLabel("" ,JLabel.RIGHT);
    JLabel literbensin = new JLabel("", JLabel.RIGHT);
    JLabel permil = new JLabel("", JLabel.RIGHT);

    public Bensin() {//Konstruktor
	setLayout(new GridLayout(2,1));
	add(p1); //Indatapanelen överst
        add(p2); //Resultatpanelen underst

        //Placera ut komponenterna i fönstrets övre halva
	p1.setLayout(new GridLayout(3,2));
	p1.add(l1); p1.add(årets);
	p1.add(l2); p1.add(förra);
	p1.add(l3); p1.add(förbrukning);

        //Koppla ihop formulären
	l1.setLabelFor(årets);
	l2.setLabelFor(förra);
	l3.setLabelFor(förbrukning);

	//Resultatpanelen
	p2.setLayout(new GridLayout(3,1));
	p2.add(kördamil);
	p2.add(literbensin);
	p2.add(permil);
	
	pack();

        //Ange vilken lyssnare som ska användas
	årets.addActionListener(this);
	förra.addActionListener(this);
	förbrukning.addActionListener(this);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
	Scanner sc1 = new Scanner(årets.getText());
	int Årets = sc1.nextInt();
	Scanner sc2 = new Scanner(förra.getText());
	int Förra = sc2.nextInt();
	Scanner sc3 = new Scanner(förbrukning.getText());
	double Förbrukning = sc3.nextDouble();
	
	int Kördamil = Årets - Förra;
	double Permil = Förbrukning/Kördamil;
	
	String s1 = "Antal körda mil:     " + Kördamil + " ";
	kördamil.setText(s1);
	String s2 = "Antal liter bensin:  " + Förbrukning + " ";
	literbensin.setText(s2);
	String s3 = String.format("Förbrukning per mil: %1.2f \n", Permil);
	permil.setText(s3);
    }

    public static void main (String[] arg) {
	Bensin bensin = new Bensin();
    }
}
