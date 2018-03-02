class Moo {
    public void method1() {System.out.println("moo 1");}
    public void method2() {System.out.println("moo 2");}
    public String toString() {return "moo";}
}

class Blue extends Moo {
    public void method1() {System.out.println("blue 1");}
}

class Flute extends Blue {
    public void method2() {System.out.println("flute 2");}
    public String toString() {return "flute";};
}

class Shoe extends Flute {
    public void method1() {System.out.println("shoe 1");}
}

public class Test {
    public static void main(String[] arg) {
	Moo[] elements = {new Shoe(), new Flute(), new Moo(), new Blue()};
	for (int i = 0; i < elements.length; i++) {
	    System.out.println(elements[i]);
	    elements[i].method1();
	    elements[i].method2();
	    System.out.println();
	}
    }
}


