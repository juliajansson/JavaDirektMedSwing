import java.util.*;

public class Vektor {
    public static double längd (ArrayList<Double> a) {
	double L = 0;
	for (int i = 0; i < a.size(); i++)
	    L = L + Math.pow(a.get(i), 2);
	double l = Math.sqrt(L);
	return l;
    }
}
