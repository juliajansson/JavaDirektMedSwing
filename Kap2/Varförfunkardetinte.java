import static javax.swing.JOptionPane.*;

public class Varförfunkardetinte {
    public static void main (String[] arg) {
	String datum = showInputDialog("Skriv dagens datum på formen åååå-mm-dd");
	String personnummer = showInputDialog("Skriv ditt personnummer på formen ååmmddxxxx");
	int födelsedag = Integer.parseInt(personnummer.substring(2,6));
	String datumdag = datum.substring(5,7) + datum.substring(8,10);
	int dagensdatum = Integer.parseInt(datumdag);
	if ( födelsedag == dagensdatum )
	    showMessageDialog(null, "Grattis!");
	System.exit(0);
    }
}
