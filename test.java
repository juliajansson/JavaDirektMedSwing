
 import static javax.swing.JOptionPane.*;

 public class Nastlade {
   public static void main (String[] arg) {
     String s = showInputDialog("Skriv ett årtal");
     int n = Integer.parseInt(s);
     String txt = "";
     for (int i=n; i>0; i=i-1) {
       for (int j=1; j<=i; j=j+1)
         txt = txt + '+';
       txt = txt + '\n';
     }
     showMessageDialog(null, txt);
     System.exit(0);
   }
 }
