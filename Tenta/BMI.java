import java.util.*;
import java.io.*;

//TODO: Felhantering

public class BMI {

    //main
    public static void main (String[] arg)
	throws IOException {
	Scanner sc = new Scanner(System.in);
	String innamn = sc.next();
	String utnamn = sc.next();
	FileReader inputR = null;
	
	FileWriter output = null;
	try {
	    inputR = new FileReader(innamn);	    
	}
	catch (FileNotFoundException e) {
	    System.out.println("Fel:" + e);
	    System.exit(1);
	}
	
	Scanner input = new Scanner(inputR);
	
	try {
	    output = new FileWriter(utnamn);
	}
	catch (IOException e) {
	    System.out.println("Fel:" + e);
	    System.exit(2);
	}
	
	Person person;
	try {
	    while (input.hasNext()) {
		person = new Person(input);
		System.out.println("ny persons vikt = " + person.vikt);
		if (person.bmi > 30)
		    output.write(person.show());
	    }
	}
	catch (InputMismatchException e) {
	    System.out.println("Fel:" + e);
	}
	finally {
	    output.close();
	}

    }

    //Klassen Person
    public static class Person {
	//Instansvariabler
	private String namnadress; 
	private int ålder;	   
	private double längd, vikt;
	private double bmi;

	//Konstruktorer
	public Person (String n, int å, double l, double v) {
	    namnadress = n;
	    ålder = å;
	    längd = l;
	    vikt = v;
	    bmi = v/Math.pow((l/100), 2);
	}

	public Person (Scanner sc) {
	    namnadress = sc.nextLine();
	    ålder    = sc.nextInt();
	    längd = sc.nextDouble();
	    vikt  = sc.nextDouble();
	    sc.nextLine(); // line för att radbryta
	    bmi = vikt/Math.pow((längd/100), 2);
	}

	//Metoder
	public String show () {
	    return this.namnadress + "\n"
		+ this.ålder + " " + this.längd + " " + this.vikt + "\n";
	}
    }
    
    //Version 1 av main
    public static void version1 ()
	throws FileNotFoundException, IOException {
	Scanner sc = new Scanner(System.in);
	String innamn = sc.next();
	String utnamn = sc.next();
	FileReader inputR = new FileReader(innamn);
	Scanner input = new Scanner(inputR);
	FileWriter output = new FileWriter(utnamn);
	output.write("Hej" + input.next());
	output.close();
    }
    
}
