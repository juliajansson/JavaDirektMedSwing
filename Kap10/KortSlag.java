  public enum KortSlag {
    TVA("2"),   TRE("3"),  FYRA("4"), FEM("5"), SEX("6"), 
    SJU("7"),   ATTA("8"), NIO("9"),  TIO("10"),
    KNEKT("J"), DAM("Q"),  KUNG("K"), ESS("A");
    public final int valör = ordinal() + 2;
    public final String symbol;
    KortSlag(String sym) {symbol = sym;}   // konstruktor
  }
