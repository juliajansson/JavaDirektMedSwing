import java.util.*;
import static javax.swing.JOptionPane.*;

public class Bilhyra2 {
    public static void main (String[] arg) {
	String indata = showInputDialog("Ange antal dagar, pris per dag samt bilmodell");
	

	double dagsPris = 0;
	int antalDagar = 0;
	String bil = "";
	boolean klar = false;
	while (!klar) {
	    if (indata == null)
		System.exit(0);
	    Scanner sc = new Scanner(indata);
	    String felText = "";
	    try {
		antalDagar = sc.nextInt();
		dagsPris = sc.nextDouble();
		bil = sc.next();
		klar = true;
	    }
	    catch (InputMismatchException e) {
		felText = "Felaktigt tal!";
	    }
	    catch (NoSuchElementException e) {
		felText = "Indata saknas!";
	    }
	    if (!klar)
		indata = showInputDialog(felText + "\nAnge antal dagar, pris per dag samt bilmodell");
	}
	
	double totPris = dagsPris * antalDagar;
	String s = String.format("Totalt pris för %s: %.2f", bil, totPris);
	showMessageDialog(null, s);
	System.exit(0);
    }
}
