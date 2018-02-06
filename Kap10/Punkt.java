public class Punkt {
    double x;
    double y;

    public Punkt() {
    }

    public Punkt(double a,double b) {
	x=a;
	y=b;
    }

    
    public Punkt(Punkt p) {
	x=p.x; y=p.y;
    }
    
    public double getx () {
	return x;
    }

    public double gety () {
	return y;
    }

    public void flytta(double dx, double dy) {
	x+=dx;
	y+=dy;
    }

    public void flytta(Punkt p) {
	x=p.x;
	y=p.y;
    }


    public double avstånd(Punkt p) { 
	// ger avståndet mellan denna punkt och punkten p 
	return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

    
    public String toString() {
	String s = "(" + x + ", " + y + ")";
	return s;
    }
}
