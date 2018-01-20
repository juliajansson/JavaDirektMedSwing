public class Palindrom {
    public static boolean ispalindrome (String a) {
	int i, j;
	for (i = 0, j = a.length() - 1; i < j; i++, j--) {
	    if (a.charAt(i) != a.charAt(j))
		return false;
	}
	return true;
    }
}
