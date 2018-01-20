import static javax.swing.JOptionPane.*;

public class Ö6 {
    public static void main (String[] arg) {
	String indata = showInputDialog("Vilken radie har din sfär?");
	double r = Double.parseDouble(indata);
	while (r <= 0) {
	    indata = showInputDialog("Ange giltigt värde på radien!");
	    r = Double.parseDouble(indata);
	}
	    
	double V = 4*Math.PI*Math.pow(r,3)/3;
	double A = 4*Math.PI*Math.pow(r,2);
	showMessageDialog(null, "Volymen är " + V + ", och ytarean är " + A + ".");
	System.exit(0);
    }
}
