import java.util.*;

public class ScanDemo {
    public static void main(String[] arg) {
	Scanner sc = new Scanner(System.in);
	System.out.println
	    ("Skriv ett antal heltal. Avsluta med Ctrl-D"); //Ctrl-D specifikt för operativsystem
	int sum=0;
	while (sc.hasNextInt()) {
	    int i = sc.nextInt();
	    sum += i;
	}
	System.out.println("Summa: " + sum);
    }
}
