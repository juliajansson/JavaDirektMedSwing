import java.util.*;

public class NavigableIntSet {
    private List<Integer> l = new LinkedList<>();
    
    public void clear() {
	l.clear();
    }
    
    public int size() {
	return l.size();
    }
    
    public boolean contains(Integer a) {
	return l.contains(a);
    }

    public void remove(Integer a) {
	l.remove(a);
    }
    
    public int first() {
	return l.get(0);
    }
    
    public int last() {
	return l.get(l.size()-1);
    }
    
    public void add(Integer a) {
	if (!l.contains(a)) {
	    l.add(a);
	    Collections.sort(l);
	}
    }
    
    public void addAll(Collection<Integer> c) {
	for (Integer a : c)
	    add(a);
    }

    public String toString() {
	String s = "";
	for (Integer n : l) {
	    s += Integer.toString(n);
	}
	return s;
    }

    public static void main (String[] arg) {
	NavigableIntSet h = new NavigableIntSet();
	h.add(new Integer(1));
	h.add(new Integer(0));
	h.add(new Integer(2));
	h.add(new Integer(3));
	h.add(new Integer(1));
	System.out.println(h.toString());
	h.remove(new Integer(0));
	System.out.println(h.first());
	h.remove(new Integer(1));
	System.out.println(h.first());
	System.out.println(h.last());
	if (!h.contains(new Integer(0)))
	    h.add(new Integer(0));
	h.add(new Integer(1));
	System.out.println(h.toString());
    }
}
