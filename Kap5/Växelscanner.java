import java.util.*;
import java.io.*;

public class Växelscanner {
    public static void main (String[] arg) throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.print("Hur mycket kostar det och vad betalar du? ");
	System.out.flush();
	int pris = sc.nextInt();
	int betalat = sc.nextInt();
	int tillbaka = betalat-pris;
	System.out.println("Växeln är:");
	System.out.println(tillbaka / 100 + " hundralappar");
	tillbaka = tillbaka % 100;
	System.out.println(tillbaka / 50 + " femtiolappar");
	tillbaka = tillbaka % 50;
	System.out.println(tillbaka / 20 + " tjugolappar");
	tillbaka = tillbaka % 20;
	System.out.println(tillbaka / 10 + " tiokronorsmynt");
	tillbaka = tillbaka % 10;
	System.out.println(tillbaka / 5 + " femkronorsmynt");
	tillbaka = tillbaka % 5;
	System.out.println(tillbaka + " enkronorsmynt");
    }
}


