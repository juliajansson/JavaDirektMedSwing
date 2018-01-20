public class Räknare {
    //Instansvariabler
    private int n; //initialvärde
    private int a,b; //gränser
    
    //Konstruktorer
    //sätt begynnelsevärde och gränsvärde
    public Räknare (int m, int min, int max) {
	a=min;
	b=max;
	if (m>=a && m<=b)
	    n=m;
	else {
	    System.out.println("Felaktigt startvärde i räknare!");
	    n=a;
	}
    }

    //sätter räknaren om a och b ej finns
    public Räknare (int m) {
	this(m, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    //Metoder
    //avläsvärde
    public int avläsVärde () {
	return n;
    }
    
    //räkna +1
    public void räknaplus () {
	if (n==b-1)
	    throw new IllegalArgumentException("Kan inte öka räknarens värde, hamnar då utanför gränsen!");
	else
	    n++;
    }
    
    //räkna -1
    public void räknaminus () {
	if (n==a+1)
	    throw new IllegalArgumentException("Kan inte minska räknarens värde, hamnar då utanför gränsen!");
	else
	    n--;
    }
}
