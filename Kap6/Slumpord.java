import java.io.*;

public class Slumpord {

  private String namn;
  private int antalOrd;

  public Slumpord(String filnamn) throws IOException {
    namn = filnamn;
    BufferedReader f = new BufferedReader(new FileReader(namn));
    // räkna antalet ord i filen
    String ord;
    while ((ord = f.readLine()) != null) {
      antalOrd++;
    }
    f.close();
  }

  public String ettOrd() throws IOException {
    // slumpa fram ordets nummer
    int k = (int) (Math.random() * antalOrd) + 1;
    // läs ord nummer k
    String ord = "";
    BufferedReader f = new BufferedReader(new FileReader(namn));
    for (int i=0; i<k; i++) 
      ord = f.readLine();
    f.close();
    return ord;
  }
}
