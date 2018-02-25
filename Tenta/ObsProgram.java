import java.io.*;
import java.util.*;

public class ObsProgram {
    public static void main (String[] args) throws IOException {
	Scanner sc = new Scanner(new File("obs.txt"));
	List<Observation> l = new LinkedList<>();
	while (sc.hasNext()) {
	    Observation obs = new Observation();
	    obs.nr = sc.nextInt();
	    obs.tid.tim = sc.nextInt();
	    obs.tid.min = sc.nextInt();
	    obs.temp = sc.nextDouble();
	    obs.vindhast = sc.nextDouble();
	    obs.vindrikt = sc.nextInt();
	    l.add(obs);
	}
	Collections.sort(l);
	for (Observation o : l)
	    System.out.println(o.nr + " " + o.tid + " " + o.temp);
	Collections.sort(l, new JfrObs());
	for (Observation o : l)
	    System.out.println(o.nr + " " + o.tid + " " + o.temp);
	
    }
	
}

class JfrObs implements Comparator<Observation> {
    public int compare(Observation o1, Observation o2) {
	if (o1.nr < o2.nr)
	    return -1;
	else if (o1.nr == o2.nr)
	    return o1.tid.compareTo(o2.tid);
	else
	    return 1;
    }
}
    

class Klockslag implements Comparable<Klockslag> {
    int tim;
    int min;

    public int compareTo(Klockslag k) {
	if (tim < k.tim || (tim == k.tim && min < k.min))
	    return -1;
	else if (tim < k.tim || (tim == k.tim && min > k.min))
	    return 1;
	else
	    return 0;
    }

    @Override
    public String toString() {
	return String.format("%02d:%02d", tim, min);
    }
}

class Observation implements Comparable<Observation> {
    int nr;
    Klockslag tid = new Klockslag();
    double temp;
    double vindhast;
    int vindrikt;

    public int compareTo(Observation annan) {
	return tid.compareTo(annan.tid);
    }
}

