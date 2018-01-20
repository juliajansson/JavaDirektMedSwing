import java.util.*;
import static javax.swing.JOptionPane.*;

public class Primtal {
    public static void main (String[] arg) {
	//System.out.println("Vilket tal?");
	int max = Integer.parseInt(arg[0]);

	String resultat="";
	for (int p : delaupp(max)) 
	    resultat += String.format("%d+%d\n", p, max-p);
	showMessageDialog(null, resultat);
    }
    
    public static ArrayList<Integer> delaupp (int max) {
	ArrayList<Integer> primsum = new ArrayList<>();
	for (int i = 2; i <= (max / 2); i++) {
	    if (isPrimtal(i) && isPrimtal(max-i))
		primsum.add(i);
	}
	return primsum;
    }
    
    public static boolean isPrimtal (int n) {
	for (int i = 2; i < Math.sqrt(n); i++)
	    if (n % i == 0)
		return false;
	return (n > 1);
    }

    public static void oldmain (String[] arg) {
	//System.out.println("Vilket tal?");
	int max = Integer.parseInt(arg[0]);
	
	for (int p : delaupp(max))
	    System.out.format("%d+%d\n", p, max-p);
    }
}
