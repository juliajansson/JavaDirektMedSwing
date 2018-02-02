 import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;

  public class Bandit1 extends JFrame implements ActionListener {
    JButton spela = new JButton("Spela"); 
    JLabel  n1 = new JLabel("",JLabel.CENTER); 
    JLabel  n2 = new JLabel("",JLabel.CENTER); 
    JLabel  n3 = new JLabel("",JLabel.CENTER); 
    JLabel info = new JLabel(" Ingen vinst ",JLabel.CENTER);
    String nummer = "";
	 
    Bandit1() {
      setTitle("En bandit");
      Font font = new Font("Times", Font.PLAIN, 36);
      spela.setFont(font); n1.setFont(font); n2.setFont(font); n3.setFont(font); info.setFont(font); 
	 
      // Bygg upp användarsnittet
      getContentPane().setBackground(Color.white);
      setLayout(new GridLayout(3,1,3,3));
      JPanel siffror = new JPanel();
      siffror.setBackground(Color.white);
      n1.setOpaque(true); n2.setOpaque(true); n3.setOpaque(true);
      add(spela); add(siffror); add(info); 
      siffror.setLayout(new GridLayout(1,3,3,3));
      siffror.add(n1); siffror.add(n2); siffror.add(n3); 
      spela.addActionListener(this);
      pack();
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	 
    // Här hanterar vi händelserna
    public void actionPerformed(ActionEvent e) {
      int t1, t2, t3;
      t1 = (int)(Math.random() * 9); 
      t2 = (int)(Math.random() * 9); 
      t3 = (int)(Math.random() * 9);
      n1.setText(t1+""); 
      n2.setText(t2+""); 
      n3.setText(t3+"");
      if ((t1==t2) && (t1==t3)) {
        info.setText("Vinst 50 kr");
      } 
      else 
        info.setText("Ingen vinst");
    }

    public static void main(String[] s) {
      Bandit1 r = new Bandit1 ();
    }
  }
