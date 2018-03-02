import java.util.*;

public class Tidklass {
    public static String tidsintervall(String t1, String t2) {
	int tim1 = Integer.parseInt(t1.substring(0,2));
	int tim2 = Integer.parseInt(t2.substring(0,2));
	int min1 = Integer.parseInt(t1.substring(3,5));
	int min2 = Integer.parseInt(t2.substring(3,5));
	int sek1 = Integer.parseInt(t1.substring(6,8));
	int sek2 = Integer.parseInt(t2.substring(6,8));

	int antalsek1 = tim1*3600 + min1*60 + sek1;
	int antalsek2 = tim2*3600 + min2*60 + sek2;

	if (antalsek2<antalsek1)
	    antalsek2+=24*3600;

	int skillnad = antalsek2-antalsek1;

	int tim = skillnad / 3600;
	int min = (skillnad % 3600) / 60;
	int sek = skillnad % 60;

	String resultat = tim + ":" + min + ":" + sek;

	return resultat;
	
    }
}
