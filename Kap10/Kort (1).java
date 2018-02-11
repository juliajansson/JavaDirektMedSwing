 public class Kort {
   private KortFarg f;
   private KortSlag s;

   public Kort(KortFarg f�rg, KortSlag ks) {
     f = f�rg; s = ks;
   }

   public KortFarg f�rg() {  
     return f;
   }

   public KortSlag slag() { 
     return s;
   }

   @Override
   public String toString() {
     return f.toString() + " " + s.toString();
   }

   public String toSymbol() {
     return f.symbol + s.symbol;
   }
 }
