import static javax.swing.JOptionPane.*;

public class Ö3 {
    public static void main (String[] arg) {
	String indata=showInputDialog("Miles per gallon?");
	double mg=Double.parseDouble(indata);
	double lm=3.785/(1.607*10*mg);
	showMessageDialog(null, "Det motsvarar" + lm + "l/mil");
	System.exit(0);
    }
}
	
	
