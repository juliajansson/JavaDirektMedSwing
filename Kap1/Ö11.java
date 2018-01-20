import static javax.swing.JOptionPane.*;

public class Ö11 {
    public static void main (String[] arg) {
	String s = showInputDialog("Antal rader?");
	int n = Integer.parseInt(s);
	String txt = "";
	for (int i=n; i>=1; i--) {
	    for (int j=1; j<=i; j++)
		txt = txt + '+';
	    txt = txt + '\n';
	}
	showMessageDialog(null, txt);
	System.exit(0);
    }
}
