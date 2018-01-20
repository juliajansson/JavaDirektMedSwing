public class Person {
    //Instansvariabler
    private String namn, adress;
    private int ålder;

    //Konstruktorer
    //sätt begynnelsevärden
    public Person (String n, String a, int å) {
	namn = n;
	adress = a;
	ålder = å;
    }
    
    //Metoder
    //avläs namn
    public String heter () {
	return namn;
    }

    //avläs adress
    public String bor () {
	return adress;
    }

    //avläs ålder
    public boolean myndig () {
	if (ålder >= 18)
	    return true;
	else
	    return false;
    }
    
}
    
