import java.util.Scanner;

public class Equals {
    public static boolean equals (int[] a, int[] b) {
	boolean lika = false;
	if (a.length != b.length)
	    lika = false;
	else {
	    for (int i = 0; i < a.length; i++) {
		lika = (a[i] == b[i]);
		if (a[i] != b[i])
		    break;
	    }
	}
	return lika;
    }

    public static void main (String[] arg) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ange antal tal i din första array");
	int antal1 = sc.nextInt();
	int[] a = new int[antal1];
	System.out.println("Ange talen i den första arrayen");
	for (int k = 0; k < antal1; k++)
	    a[k] = sc.nextInt();
	
	System.out.println("Ange antal tal i din andra array");
	int antal2 = sc.nextInt();
	int[] b = new int[antal2];
	System.out.println("Ange talen i den första arrayen");
	for (int k = 0; k < antal2; k++)
	    b[k] = sc.nextInt();
	
	if (equals(a,b))
	    System.out.println("Arrayerna är lika!");
	else
	    System.out.println("Arrayerna är inte lika ;/");
    }
	
}
