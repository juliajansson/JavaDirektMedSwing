import java.util.*;
import java.io.*;

//TODO: gör med Scanner

public class Växel {
    public static void main (String[] arg) throws IOException {
	BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Hur mycket kostar det? "); //Inte println för att användaren ska kunna svara på samma rad
	System.out.flush(); //Inbyggd i println men inte i print
	String s = myIn.readLine();
	int pris = Integer.parseInt(s);
	System.out.print("Vad betalar du? ");
	System.out.flush();
	s = myIn.readLine();
	int betalat = Integer.parseInt(s);
	String v = växel(betalat-pris);
	System.out.print("Växeln är: " + v);
    }

    public static String växel (int n) {
	int hundra = n / 100;
	int femtio = (n - 100*hundra) / 50;
	int tjugo  = (n - 100*hundra - 50*femtio) / 20;
	int tio    = (n - 100*hundra - 50*femtio - 20*tjugo) / 10;
	int fem    = (n - 100*hundra - 50*femtio - 20*tjugo - 10*tio) / 5;
	int en     = (n - 100*hundra - 50*femtio - 20*tjugo - 10*tio - 5*fem);
	String s="";
	if (hundra != 0)
	    s += hundra + " hundralappar\n";
	else
	    s += "";
	if (femtio != 0)
	    s += femtio + " femtiolappar\n";
	else
	    s += "";
	if (tjugo != 0)
	    s += tjugo + " tjugolappar\n";
	else
	    s += "";
	if (tio != 0)
	    s += tio + " tiokronor\n";
	else
	    s += "";
	if (fem != 0)
	    s += fem + " femkronor\n";
	else
	    s += "";
	if (en != 0)
	    s += en + " enkronor\n";
	else
	    s += "";
	return s;
    }
}


