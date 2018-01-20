import static javax.swing.JOptionPane.*;
import java.util.*;

public class Ö8 {
    public static void main (String[] arg) {
	while (true) {
	    String in = showInputDialog("Vilken svårighetsgrad var hoppet?");
	    if (in == null)
		break;
	    int svår = Integer.parseInt(in);
	    double[] poäng = {0,0,0,0,0,0,0};
	    int i=0;
	    for (i=0; i<7; i++) {
		int a = i + 1;
		in = showInputDialog("Vilken poäng gav den jurymedlemmen nr " + a + "?");
		double nuvarandepoäng = Integer.parseInt(in);
		poäng[i]=nuvarandepoäng;
	    }
	    java.util.Arrays.sort(poäng);
	    double medelvärde = (poäng[1] + poäng[2] + poäng[3] + poäng[4] + poäng[5])/5;
	    double resultat = 3*medelvärde*svår;
	    showMessageDialog(null, "Resultatet är " + resultat + " " +  medelvärde);
	}
	System.exit(0);
    }
}
