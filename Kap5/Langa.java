import java.io.*;
import java.util.*;

public class Langa {
    public static void main (String[] arg) throws FileNotFoundException, IOException, NoSuchElementException {
	System.out.println("Vilka filer ska läsas in?");
	Scanner sc = new Scanner(System.in);
	String infil = sc.next();
	String utfil = sc.next();
	Scanner myIn = new Scanner(new File(infil));
	PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter(utfil)));

	while (myIn.hasNextLine()) {
	    String namnadress = myIn.nextLine();
	    //System.out.println(namnadress);
	    int ålder = myIn.nextInt();
	    //System.out.println(ålder);	    
	    int längd = myIn.nextInt();
	    //System.out.println(längd);	    
	    double vikt = myIn.nextDouble();
	    myIn.nextLine();

	    if (längd >= 200) {
		ut.println(namnadress);
		ut.println(ålder + " " + längd + " " + vikt);
	    }
	}

	ut.close();
	
    }
}
