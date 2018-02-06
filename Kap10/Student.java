import java.util.*;

public class Student extends Person {
    public List<Kurs> ks = new LinkedList<>();

    public Student(String n, String a, int å) {
	super(n,a,å);
    }
	

    public void getKurser (){
	for (Kurs k : ks) {
	    System.out.println(k.toString());
	    System.out.flush();
	}
    }
}


