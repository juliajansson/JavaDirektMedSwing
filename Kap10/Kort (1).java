 public class Kort {
   private KortFarg f;
   private KortSlag s;

   public Kort(KortFarg färg, KortSlag ks) {
     f = färg; s = ks;
   }

   public KortFarg färg() {  
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
