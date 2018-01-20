import java.io.*;

public class Utskrift {
    public static void main (String[] arg) throws FileNotFoundException {
	BufferedReader inström = new BufferedReader ( new FileReader("lista.txt"));
	int radNr = 0;
	while (true) {
	    String rad = inström.readLine();
	    if (rad == null)
		break;
	    radNr++;
	    System.out.println(radNr + ": " + rad);
	}
    }
}
