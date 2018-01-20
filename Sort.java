import java.io.*;
import java.util.*;

//TODO: fixa med Patrik!

public class Sort {
    public static void main (String[] arg) throws IOException {
	Scanner sc = new Scanner (System.in);
	System.out.print("Ange talen i arrayen ");
	System.out.flush();
	List<Integer> l = new ArrayList<>();
	while (sc.hasNext())
	    l.add(sc.nextInt());
	Integer[] a = l.toArray(new Integer[0]);
	//	System.out.println(ArrayList.toString(l));
	System.out.println(Arrays.toString(Sort.sortera(a, 0, a.length)));  //Funkar int y not
    }
    
    public static Integer[] sortera (Integer[] a, int start, int slut) {
	// a referens till arrayen - ändrar det som pekas på
	for (int k = start; k < slut; k++) {
	    int m = k;
	    for (int i = k; i <= slut; i++) {
		if (a[i] < a[m])
		    m=i;
	    }
	    Integer temp = a[k];
	    a[k] = a[m];
	    a[m] = temp;
	}
	return a;
    }

    public static int binSök (double[] a, int start, int slut, double sökt) {
	int i1 = start;
	int i2 = slut;
	int m = 0;
	while (i1 <= i2) {
	    m= (i1 + i2)/2;
	    if (sökt < a[m])
		i2 = m-1;
	    else if (sökt < a[m])
		i1 = m+1;
	    else
		break;
	}
	if (sökt == a[m])
	    return m;
	else
	    return start-1;
    }

    public class Person {
	String förnamn, efternamn;
	int föddÅr;
	boolean singel;
    }
}

    //        public static void sortera(Person[] a, int start, int slut) {
    //	Collator c = Collator.getInstance(); //Hjälp med bokstavsordning, beror på local
    //	c.setStrength(Collator.PRIMARY);
    //	for (int k = start; k < slut; k++) {
    //	    int m = k;
    //	    for (int i = k; i <= slut; i++)
    //		if (c.compare(a[i].efternamn, a[m].efternamn) < 0 ||
    //		   (c.compare(a[i].efternamn, a[m].efternamn) == 0 &&
    //		    c.compare(a[i].förnamn, a[m].förnamn) < 0))
    //		    m=i;
    //	    Person temp = a[k];
    //	    a[k] = a[m];
	    //Forstättning...
    //	}

