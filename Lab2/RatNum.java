public class RatNum {
    //Rekursiv Euklides Algoritm
    public static int sgd(int m, int n){
		if(n == 0 || m == 0)
			throw new IllegalArgumentException ();
		if(n < 0) n = -n;
		if(m < 0) m = -m;
		if(n > m)
			return sgd(n, m);
		if(m % n == 0)
			return n;
		return sgd(n, m % n);
	}
    
	private int p, q;
    
	public RatNum(){
		p=0;
		q=1;
	}
	public RatNum(int a) {
		p=a;
		q=1;
	} 
	public RatNum(int a, int b) {
		if (b==0) throw new NumberFormatException("Denominator = 0");
		if (a==0) {
			p=0;
			q=1;
		}
		else {
			int s = sgd(a, b);
			p=a/s;
			q=b/s;
		}	
		if ((p < 0 && q < 0) || (p > 0 && q < 0)) {
			p = -p;
			q = -q;
		}
	}
	public RatNum(RatNum r) {
		p=r.p;
		q=r.q;
	}
	public int getNumerator () {
		return p;
	}
	public int getDenominator () {
		return q;
	}
    //Skriv ut i blandad form
	public String toString () {
		if (p / q == 0)
			return p + "/" + q;
		return p / q + " " + Math.abs(p % q) + "/" + q;
	}
	public double toDouble () {
		return ((double)p) / q;
	}
	public static RatNum parse(String s){
		if(!s.contains("/"))
			s += "/1";
		String[] parts = s.split("/");
		//Om t.ex. s="2/"
		if(parts.length == 1)
			parts = new String[]{"", ""};
		return new RatNum(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
	}
	public RatNum(String s) {
		RatNum r = parse(s);
		p=r.p;
		q=r.q;
	}
	public Object clone () {
		return new RatNum(p, q);
	}
	public Boolean equals (RatNum r) {
		return r.p == p && r.q == q;
	}
	public Boolean lessThan (RatNum r) {
		return p * r.q < q * r.p;
	}
	public RatNum add (RatNum r) {
		return new RatNum (p*r.q+q*r.p, q*r.q); 
	}
	public RatNum sub (RatNum r) {
		return new RatNum (p*r.q-q*r.p, q*r.q); 
	}
	public RatNum mul (RatNum r) {
		return new RatNum (p*r.p, q*r.q);
	}
	public RatNum div (RatNum r) {
		return new RatNum (p*r.q, q*r.p);
	}
}
