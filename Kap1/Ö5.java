import static javax.swing.JOptionPane.*;

public class Ö5 {
    public static void main (String[] arg) {
	String indata1 = showInputDialog("Vilket år är det nu?");
	String indata2 = showInputDialog("Vilken årsmodell är din bil?");
	int år = Integer.parseInt(indata1);
	int årsmodell = Integer.parseInt(indata2);
	int ålder = år - årsmodell;
	if (ålder < 5)
		       showMessageDialog(null, "Välj en helförsäkring!");
	else if (ålder < 25)
			    showMessageDialog(null, "Välj en halvförsäkring!");
	else
	    showMessageDialog(null, "Välj en veteranbilsförsäkring!");
	System.exit(0);
    }
}
