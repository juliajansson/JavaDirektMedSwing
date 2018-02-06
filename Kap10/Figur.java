public abstract class Figur {
    protected Punkt startp;
    public final static double pi=Math.pi;

    public Figur() {
	startp= new Punkt();
    }

    public Figur(double x, double y) {
	startp = new Punkt(x,y);
    }

    public Figur(Punkt p) {
	startp = new Punkt(p);
    }

    public void flytta(double dx, double dy) {
	startp = startp.flytta(dx,dy);
    }

    public void flytta(Punkt p) {
	startp = startp.flytta(p);
    }

    public Punkt startpunkt() {
	return new Punkt(startp);
    }

    public abstract double area();
}

class Cirkel extends Figur {
    private double r;

    public Cirkel(double x, double y, double rad) {
	super(x,y);
	r=rad;
    }

    public Cirkel(Punkt mitt, double rad) {
	super(mitt);
	r=rad;
    }

    public double radie() {
	return r;
    }

    public double area() {
	return pi*r*r;
    }

}

class Triangel extends Figur {
    private punkt p2, p3;

    public Triangel(Punkt pa, Punktpb, Punkt pc) {
	super(pa);
	p2 = new Punkt(pb.x-pa.x,pb.y-pa.y);
	p3 = new Punkt(pc.x-pa.x,pc.y-pa.y);
    }

    public Punkt horn(int i) {
	if (i==1)
	    return startp;
	else if (i==2)
	    return new Punkt(p2.x+startp.x, p2.y+startp.y);
	else if (i==3)
	    return new Punkt(p3.x+startp.x, p3.y+startp.y);
	else {
	    System.out.println("Felaktigt argument");
	    return startp;  // något måste returneras i alla fall
	}
    }

    public double area() {
	double a = start.avstånd(p2), b= startp.avstånd(p3), c=p2.avstånd(p3);
	double s = (a+b+c)/2;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

class Rektangel extends Figur {
    private double b, h;  // bredd och höjd
    
  // Övre vänstra hörnet ges som starpunkt
    public Rektangel(double br, double hö, double x, double y) {
	super(x,y);
	b=br; h=hö;
    }
    
    public Rektangel(double br, double hö, Punkt start) {
	super(start);
	b=br; h=hö;
    }
    
    public double bredd() {
	return b;
    }
    
    public double höjd() {
	return h;
    }
    
    public double area() {
	return b*h;
    }
}
