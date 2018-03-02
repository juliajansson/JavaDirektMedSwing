import javax.swing.*;
import java.util.*;
import java.io.*;

public class Resultat {

    public static void main(String[] arg) {
	String filnamn = JOptionPane.showInputDialog("Vilken fil?");
	Scanner sc = null;
	try {
	    sc = new Scanner(new File(filnamn));
	}
	catch (FileNotFoundException e) {
	    JOptionPane.showMessageDialog(null, "Filen hittades ej!");
	    return;
	}
	String utnamn = JOptionPane.showInputDialog("Utfilens namn?");

	List<String> res = new LinkedList<>();

	while (sc.hasNext()) {
	    String starttid = sc.next();
	    String sluttid = sc.next();
	    String restenrad = sc.nextLine();
	    String resultat = Tidklass.tidsintervall(starttid, sluttid);
	    if (!sluttid.equals("00:00:00"))
		res.add(resultat + restenrad);
	}

	Collections.sort(res);

	PrintWriter utfil = null;
	try { 
	    utfil = new PrintWriter(new BufferedWriter(new FileWriter(utnamn))); }
	catch (IOException e) {
	    JOptionPane.showMessageDialog(null, "Filen kan ej skrivas!");
	    return;
	}
	    
	for (String rad : res)
	    utfil.println(rad);
	utfil.close();
    }
}
