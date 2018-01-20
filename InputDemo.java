import java.io.*;

public class InputDemo {
    public static void main (String[] arg) throws IOException{ //genererar felmedellanden
       	      BufferedReader input = new BufferedReader
		  (new InputStreamReader(System.in));  //Hämtar från System.in
	      System.out.println("Vad heter du?");
	      String s = input.readLine();        //Finns i Bufferedreader
	      System.out.println("Hej " + s + "!");
       }
}
