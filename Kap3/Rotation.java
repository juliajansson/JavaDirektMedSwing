import java.util.*;

public class Rotation {
    public static int[] rotera(int[] a, int k) {
	int[] b = new int[a.length];
	for (int i = 0; i < a.length; i++) {
	    int j = (i + k) % a.length;
	    b[j]=a[i];
	}
	return b;
    }

    public static void main (String[] arg) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Antal element i ditt fält?");
	int antal = sc.nextInt();
	int[] a = new int[antal]; 
	System.out.println("Ange element i ditt fält.");
	for (int i = 0; i < antal; i++)
	    a[i] = sc.nextInt();
	System.out.println("Antal steg rotation?");
	int steg = sc.nextInt();
	System.out.println("Din roterade array är:");
	for (int d : rotera(a,steg))
	    System.out.println(d);
    }
	
	    
}
