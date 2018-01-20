public class MyStringBuilder {
    //Instansvariabler
    private char[] text;
    private int längd;
    private int kapacitet;

    //Konstruktorer
    public MyStringBuilder() {
	text = new char[16];
	längd = 0;
	kapacitet = 16;
    }

    public MyStringBuilder(String s) {
	längd = s.length();
	kapacitet = längd + 16;
	text = new char[kapacitet];
	for (int i = 0; i < längd; i++)
	    text[i] = s.charAt(i);
    }

    //Metoder
    public int length() {
	return längd;
    }

    public int capacity() {
	return kapacitet;
    }

    public void ensureCapacity(int k) {
	//System.out.println(kapacitet);
	while (kapacitet < k) {
	    kapacitet *= 2;
	    char[] nytext = new char[kapacitet];
	    for (int i = 0; i < längd; i++)
		nytext[i] = text[i];
	    text = nytext;
	    //System.out.println(kapacitet);
	}
    }

    public void insert(int p, String s) {
	int a = s.length();
	if (p >= 0 && p <= längd) {
	    //System.out.println(kapacitet);
	    ensureCapacity(längd + a);
	    //System.out.println(kapacitet);
	    for (int i = p; i < (p + a); i++) {
		char temp = text[i];
		text[i] = s.charAt(i-p);
		text[i+a-1] = temp;
	    }
	    längd = längd + s.length();
	}
	else
	    throw new IndexOutOfBoundsException();
    }

    public void append(String s) {
	insert(längd, s);
	längd  = längd + s.length();
    }

    public String substring(int p, int m) {
	if (p >= 0 && p <= längd && m >= 0 && m <= längd && p <= m) {
	    char[] v = new char[m-p];
	    for (int i = p; i <= m-1; i++)
		v[i-p] = text[i];
	    String s = new String(v);
	    return s;
	}
	else
	    throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
	return substring(0,längd);
    }

    public static void main (String[] arg) {
	String a = arg[0];
	MyStringBuilder s = new MyStringBuilder(a);
	s.insert(2,"HEJKOMOCHHJÄLPMIG");
	s.append("SWAG");
	String hej = s.substring(1,10);
	System.out.format("%d %d %s\n %s\n %s", s.length(), s.capacity(), s, hej, a);
    }
	
	    
}
