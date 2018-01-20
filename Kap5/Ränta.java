import java.util.*;
import java.io.*;

public class Ränta {
    public static void main (String[] arg) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Kapital? ");
	int kapital = sc.nextInt();
	System.out.print("Ränta? ");
	double ränta = sc.nextDouble();
	double räntesats = 1 + (ränta/100);
	for (int i=1; i<=10; i++)
	    System.out.println("Ett års ökning: " + kapital*(Math.pow(räntesats, i)));
    }
}
