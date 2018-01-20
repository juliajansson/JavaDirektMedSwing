import static javax.swing.JOptionPane.*;

public class Ö7 {
    public static double abs(double x) {
	if (x > 0)
	    return x;
	else
	    return -x;
    }
    
    public static double sqrt (double x) {
	double g = x;
	double gny = x/2;
	while (abs(g-gny) > 1e-6) {
	    g = gny;
	    gny = (g + x/g)/2;
	}
	return gny;
    }
    
    public static void main (String[] arg) {
	while (true) {
	    String indata = showInputDialog("Vilket tal?");
	    if (indata == null)
		break;
	    double x = Integer.parseInt(indata);
	    showMessageDialog(null, sqrt(x));
	}
	System.exit(0);
    }
}
