public class C {
    //Klassvariabler
    private static int totAntal;

    //Konstruktorer
    public C () {   //varje gång ett objekt initieras ökar totAntal!
	totAntal++;
    }
    
    //Klassmetoder
    public static int avläsAntal () {
	return totAntal;
    }
}
