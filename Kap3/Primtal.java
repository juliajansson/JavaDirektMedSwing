public class Primtal {
    public static int[] primtal () {
	int[] primtal = new int[50];
	boolean prim;
	int antal = 0;
	int tal = 1;
	
	while (antal < 50) { //antal som i:et i motsvarande for loop,
	    // skulle kunnat ha for loop men då vet jag inte vilken övre gräns jag ska ha
	    tal++; //går genom tal för tal
	    prim = true; //sätt till true
	    for (int k = 0; k < antal && prim; k++) //avsluta när inte längre prim och gå till if satsen
		if (tal % primtal[k] == 0)
		    prim = false;
	    if (prim) // var true från början, om inte delbart med något av k - talen då true
		primtal[antal++] = tal;
	}
	return primtal;
    }
}
