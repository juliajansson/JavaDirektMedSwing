import static javax.swing.JOptionPane.*;
import java.util.*;

public class Ö7 {
    public static void main (String[] arg) {
	String insvår = showInputDialog("Vilken svårighetsgrad var hoppet?");
	int svår = Integer.parseInt(insvår);
	int[] poäng = {0,0,0,0,0,0,0};
	int i=0;
	for (i=0; i<7; i++) {
	    String in = showInputDialog("Vilken poäng gav den jurymedlemmen nr " + i + "?");
	    int nuvarandepoäng = Integer.parseInt(in);
	    poäng[i]=nuvarandepoäng;
	}
	java.util.Arrays.sort(poäng);
	int medelvärde = (poäng[1] + poäng[2] + poäng[3] + poäng[4] + poäng[5])/5;
	int resultat = 3*medelvärde*svår;
	showMessageDialog(null, "Resultatet är " + resultat);
	System.exit(0);
    }
}
