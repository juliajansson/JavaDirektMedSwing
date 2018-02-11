import java.util.*;

//Har teckenproblem så kan inte köra filen - men kollar om det liknar facit...

public class JfrKrt implements Comparator<Kort> {
    public int compare (Kort a, Kort b) {
	int i = a.färg().compareTo(b.färg());
	if (i!=0)
	    return i;
	else {
	    if (a.slag().valör < b.slag().valör)
		return -1;
	    else if (a.slag().valör > b.slag().valör)
		return 1;

	    else
		return 0;
	}
    }
}
