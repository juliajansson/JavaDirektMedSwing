public class Kort {
    //Instansvariabler
    private int färg; //(1-4)
    private int valör; //(1-13)
    
    //Konstruktorer
    //sätt begynnelsevärde
    public Kort (int f, int v) {
	if (f < 1 || f > 4 || v < 1 || v > 13) {
	    System.out.println("Felaktig intiering!");
	    f = v = 1;
	}
	else {
	    färg=f;
	    valör=v;
	}
    }

    //Metoder
    //gör om kort i int till string
    public String toString () {
	String kort = "";
	
	if (färg == 1)
	    kort = "Klöver";
	else if (färg == 2)
	    kort = "Ruter";
	else if (färg == 3)
	    kort = "Hjärter";
	else
	    kort = "Spader";

	
	if (valör > 1 && valör < 11)
	    kort = kort + valör;
	else if (valör == 1)
	    kort = kort + "Ess";
	else if (valör == 11)
	    kort = kort + "Knekt";
	else if (valör == 12)
	    kort = kort + "Dam";
	else
	    kort = kort + "Kung";

	return kort;
	
    }

}
