 public class Kort {
   private KortFarg f;
   private KortSlag s;

   public Kort(KortFarg farg, KortSlag ks) {
     f = farg; s = ks;
   }

   public KortFarg farg() {  
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
