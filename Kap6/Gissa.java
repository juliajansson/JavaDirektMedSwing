//Felaktig historia - infogar lösningen nedan

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.io.*;

class HängaGubbe extends JFrame implements ActionListener {
    JLabel fråga = new JLabel("Vad gissar du?");
    JLabel ord = new JLabel();
    JTextField j = new JTextField(10);
    String hemligt;

    public HängaGubbe(String s) {
	hemligt = s;
	
	setLayout(new GridLayout(3,1));
	add(ord); add(fråga); add(j);
	
	int n = s.length();
	String ar = "";
	for (int i=0; i<n; i++)
	    ar+="?";
	ord.setText(ar);

	j.addActionListener(this);

	setSize(200,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	

    public String väljOrd() throws IOException {
	Scanner sc = new Scanner(new File("ord.txt"));
	List<String> ord = new LinkedList<>();
	while (sc.hasNext())
	    ord.add(sc.next());
	String x = ord.get(0);
	return x;
    }
    
    public static void main (String[] arg) {
	new HängaGubbe("jagare");
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == j) {
	    String a = j.getText();
	    String st = "";
	    int n = st.length();
	    for (int i=0; i<n; i++) {
		String hmm = Character.toString(hemligt.charAt(i));
		if (hmm ==a)
		    st+=a;
		else
		    st+="?";
	    }   
	    ord.setText(st);
	    j.setText("");
	    
	}
    }
}


public class Gissa extends JFrame implements ActionListener {
  JPanel p = new JPanel();
  JLabel l = new JLabel();
  JTextField t = new JTextField();
  JProgressBar pb = new JProgressBar(0, 100);
  Slumpord o;
  String okäntOrd, ordet, visatOrd;
  int antalFel, maxFel;

  public Gissa() throws IOException {
    o = new Slumpord("ord.txt"); 
    l.setFont(new Font("Monospaced", Font.PLAIN, 20));
    t.setFont(new Font("Monospaced", Font.PLAIN, 20));
    add(BorderLayout.CENTER, p); add(BorderLayout.SOUTH, pb);
    p.setLayout(new GridLayout(2,1));
    p.add(l); p.add(t);
    pb.setForeground(Color.red);
    setSize(200, 100);
    l.setHorizontalAlignment(JLabel.CENTER);
    nytt();
    t.addActionListener(this);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
  }

  private void nytt() {
    try {
      ordet = o.ettOrd(); 
    }
    catch (IOException e) {}
    okäntOrd = ordet;
    // låt visatOrd innehålla ordet.length() st frågetecken 
    visatOrd = "";
    for (int i=0; i<ordet.length(); i++)
      visatOrd = visatOrd + '?';
    l.setForeground(Color.black);
    l.setText(visatOrd);
    t.setText("");
    pb.setValue(0); 
    antalFel=0;
    maxFel = ordet.length();
  }    

  public void actionPerformed(ActionEvent e) {
    if (visatOrd.equals(ordet))  // ordet klart, börja på ett nytt
      nytt();    
    else if (e.getSource() == t) {
      char c = t.getText().charAt(t.getText().length()-1);  // läs in sista bokstaven
      int i = okäntOrd.indexOf(c);               // finns den i ordet?
      if (i == -1) {                              // nej!
        if (++antalFel <= maxFel) 
          pb.setValue(100 * antalFel/maxFel);
        if (antalFel == maxFel) {                  // för många felgissningar 
          l.setForeground(Color.red);
          visatOrd = ordet;                       // visa det rätta ordet
        }
      }
      else {  // ja!
        // flytta bokstaven från okäntOrd till visatOrd
        okäntOrd = okäntOrd.substring(0, i) + '*' + okäntOrd.substring(i+1, okäntOrd.length());
        visatOrd = visatOrd.substring(0, i) +  c  + visatOrd.substring(i+1, visatOrd.length());              
      }
      l.setText(visatOrd); 
    }
  } 
                     
  public static void main(String[] arg)  throws IOException  {
    new Gissa();
  }
}
