
 import static javax.swing.JOptionPane.*;

 public class Lab1steg1 {
   public static void main (String[] arg) {
       while (true)
	   {String s = showInputDialog("Skriv ett årtal");
	   if (s==null)
	       break;
	   int n = Integer.parseInt(s);
	   if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
	       showMessageDialog(null, "Skottår");}
	   else {
	       showMessageDialog(null,"Inte skottår");}
	   }
     System.exit(0);
   }
 }
