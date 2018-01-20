public class ärLöst {
    public static boolean ärLöst (int[][] sudoku) {
	return (rader(sudoku) && kolumner(sudoku) && regioner(sudoku) );
    }
    
    public static boolean rader (int[][] a) {
	for (int[] rad : a)
	    if (!ärSekvens(rad, 1, 9))
		return false;
	return true;
    }

    public static boolean kolumner (int[][] a) {
	int[] kolumn = new int[9];
	for (int k = 0; k < 9; k++) {
	    for (int i = 0; i < 9; i++)
		kolumn[i] = a[k][i];
	    if (!ärSekvens(kolumn, 1, 9))
		return false;
	}
	return true;
    }

    public static boolean regioner (int[][] a) {
	//för varje region
	int[] region = new int[9];
	for (int rr = 0; rr < 3; rr++)
	    for (int rk = 0; rk < 3; rk++) {

		//bygg region
		for (int r = 0; r < 3; r++)
		    for (int k = 0; k < 3; k++)
			region[3*r+k] = a[3*rr+r][3*rk+k];
		
		//kolla region
		if (!ärSekvens(region, 1, 9))
		    return false;
	    }
	return true;
    }

    public static boolean ärSekvens (int[] a, int n, int m) {
	return true;
    }
    
}
