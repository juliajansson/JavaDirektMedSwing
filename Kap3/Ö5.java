import static javax.swing.JOptionPane.*;

public class Ö5 {
    public static boolean perfekt (int tal) {
	int sum = 0;
	int k;
	for (k = 1; k < tal; k++)
	    if (tal % k == 0)
		sum += k;
	return sum == tal;
    }

    public static void main (String[] arg) {
	while (true) {
	    String indata = showInputDialog("Tal som skall testas?"); 
	    if (indata == null)
		break;
	    int n = Integer.parseInt(indata);
	    String resultat;
	    if (perfekt(n))
		resultat = "Talet är perfekt";
	    else
		resultat = "Talet är inte perfekt";  
	    showMessageDialog(null, resultat);
	}
	System.exit(0);
    }
}
