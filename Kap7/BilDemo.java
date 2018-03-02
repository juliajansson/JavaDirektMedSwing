// Filen BilDemo.java

import java.awt.*;
import javax.swing.*;

class Person {
  protected String na, adr;   // Obs! protected
  protected int år;           // Obs! protected

  protected Person() {} // måste finnas för subklassens skull

  public Person(String namn, String adress, int ålder) {
    na = namn;
    adr = adress;
    år = ålder;
  }

  public String heter() {
    return na;
  }

  public String bor() {
    return adr;
  }

  public int  hur_gammal() {
    return år;
  }
}

class Bilagare extends Person {
  private Bil bilen;

  public Bilagare(String namn, String adress, int ålder) {
    na = namn;
    adr = adress;
    år = ålder;
  }

  public Bil äger() {
    return bilen;
  }

  public void säljBil() {
    if (bilen != null) { 
      bilen.såld();
      bilen = null;     
    }
  }

  public void köpBil(Bil nyBil) {
    if (nyBil.ägsAv() == null) {
      bilen = nyBil;
      bilen.köpt(this);
    }
  }
}

class Bil extends JPanel {

  JLabel regLabel = new JLabel();
  JLabel fabLabel = new JLabel();
  private String regNr;
  private String bilmärke;
  private Bilagare ägare;

  public Bil(String nr, String fabrikat) {
    regNr = nr; 
    bilmärke = fabrikat;
    regLabel.setText(regNr);
    fabLabel.setText(bilmärke);
    setLayout(new FlowLayout());
    add(regLabel);
    add(fabLabel);
  }

  public String toString () {
    return regNr + " " + bilmärke;
  }

  public Bilagare ägsAv() {
    return ägare;
  }  

  public void såld() {   // skall endast anropas av bilens ägare
      ägare = null;
  }

  public void köpt(Bilagare nyÄgare) {  // skall endast anropas av bilens ägare
      ägare = nyÄgare;
  }

}

public class BilDemo extends JFrame {

  BilDemo() {
    setLayout(new GridLayout(1,3));
    add(new Bil("abc123", "Renault Twingo"));
    add(new Bil("999zzz", "Ford Fiesta"));
    add(new Bil("555aaa", "Fiat Uno"));
    pack();
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
     
  public static void main(String[] arg) {
    BilDemo bd = new BilDemo();
  }
}

  
