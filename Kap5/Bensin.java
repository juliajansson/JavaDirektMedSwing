import java.util.*;

public class Bensin {
    public static void main (String[] arg) {
	Scanner sc = new Scanner(System.in);
	int årets = sc.nextInt();
	int förra = sc.nextInt();
	double förbrukning = sc.nextDouble();
	int kördamil = årets - förra;
	double permil = förbrukning/kördamil;
	System.out.println("Antal körda mil:     " + kördamil);
	System.out.println("Antal liter bensin:  " + förbrukning);
	System.out.format("Förbrukning per mil: %1.2f\n", permil);
    }
}
