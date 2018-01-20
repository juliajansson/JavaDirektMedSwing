
 import static javax.swing.JOptionPane.*;

 public class Lab1steg2 {
   public static void main (String[] arg) {
       while (true) {
	   String s = showInputDialog("Skriv ett datum på formen åååå-mm-dd");
	   if (s==null)
	       break;
	   int n = Integer.parseInt(s.substring(0, 4));
	   Boolean skott = (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0));
	   int a = Integer.parseInt(s.substring(5, 7));
	   int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   if(skott)
	       m[1] += 1;

	   int antal = 0;
     
	   for(int i = 0; i < a-1; i++) {
	       antal += m[i];
	   }

	   int d = Integer.parseInt(s.substring(8, 10));

	   antal += d;
	   showMessageDialog(null, "Dagens nummer är " + antal);}
       System.exit(0);
   }
 }
