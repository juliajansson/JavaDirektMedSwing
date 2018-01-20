import java.util.*;
import java.text.*;
import java.io.*;

public class TextAnalys {
    public static void main(String[] arg) throws IOException {
	Collator co = Collator.getInstance();
	co.setStrength(Collator.PRIMARY);
	SortedSet<String> m = new TreeSet<String>(co);
	Scanner sc = new Scanner(new File(arg[0]));

	SortedSet<String> mres = new TreeSet<String>(co);
	String[] resord = { "abstract", "boolean", "break", "byte", "byvalue", "case",
                         "cast", "char", "class", "const", "continue", "default",
                         "do", "double", "else", "enum", "extends", "false", "false", "final",
                         "finally", "float", "for", "future", "generic", "goto", "if",
                         "implements", "import", "inner", "instanceof", "int", "interface",
                         "long", "native", "new", "null", "operator", "outer", "package",
                         "private", "protected", "public", "rest", "return", "short",
                         "static", "super", "switch", "synchronized", "this", "throw",
                         "throws", "transient", "trap", "true", "try", "var", "void",
                         "volatile", "while"};
	for (int k = 0; k < resord.length; k++)
	    mres.add(resord[k]);
	

	while (sc.hasNext()) {
	    String ord = sc.next();
	    if (!mres.contains(ord))
		m.add(ord);
		}

	for (String ord : m)
	    System.out.println(ord);
    }
}
