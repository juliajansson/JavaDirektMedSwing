import java.util.*;

public class Kurs {
    public String namn;
    public int hp;
    public List<Student> ss = new LinkedList<>();

    public String toString() {
	return namn;
    }

     public void getStudenter(){
	for (Student s : ss) {
	    System.out.println((s.heter()));
	    System.out.flush();
	}
    }

    public void avhopp(Student s) {
	if (ss.indexOf(s) == -1)
	    ss.remove(ss.indexOf(s));
    }

     public void läggTill(Student s) {
	 ss.add(s);
    }
    
	    
}
