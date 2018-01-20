
 import static javax.swing.JOptionPane.*;

 public class Test {
   public static void main (String[] arg) {
     String s = showInputDialog("Skriv ett årtal");
     int n = Integer.parseInt(s);
     if ((n % 4) == 0) {
          showMessageDialog(null, "Skottår");}
     else {
          showMessageDialog(null,"Inte skottår");}
     System.exit(0);
   }
 }
