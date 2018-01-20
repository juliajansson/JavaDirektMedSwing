import java.util.*;

public class ScanDemoDouble {
    public static void main(String[] arg) {
	String s = JOptionPane.showInputDialog("Ange talen som skall summeras");
	Scanner sc = new Scanner(s);
	double sum = 0;
	while (sc.hasNextDouble()) {
	    int i = sc.nextDouble();
	    sum += i;
	}
	System.out.println("Summa: " + sum);
    }
}
