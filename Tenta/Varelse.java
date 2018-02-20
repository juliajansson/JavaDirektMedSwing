public abstract class Varelse {
    protected int energi = 100;//0=död, 100=full styrka
    private String namn;

    public Varelse(String namn) {
	this.namn = namn;
    }

    public String heter() {
	return namn;
    }

    public int energi() {
	return energi;
    }

    public void ändraEnergi(int e) {
	if (e >= 0 && e <= 100)
	    energi = e;
	else
	    throw new IllegalArgumentException("Värdet på energin är ej giltigt");
    }

    public abstract int skada();
}

class Orm extends Varelse {
    public Orm(String namn) {
	super(namn);
    }

    public int skada() {
	return 10*energi;
    }
}

class Troll extends Varelse {
    public Troll(String namn) {
	super(namn);
    }

    public int skada() {
	return 5*energi;
    }
}

class Spindel extends Varelse {
    public Spindel(String namn) {
	super(namn);
    }

    public int skada() {
	if (energi > 0)
	    return 100;
	else
	    return 0;
    }
}

class Gäng {
    private Varelse[] medlemmar;

    public Gäng(int storlek) {
	medlemmar  = new Varelse[storlek];
    }
    
    public void läggTill(Varelse v, int index) {
	medlemmar[index] = v;
    }
    
    public int gemensamSkada() {
	int tot = 0;
	for (Varelse varelse : medlemmar)
	    if (varelse != null) {
		tot += varelse.skada();
	    }
	return tot;
	    
    }
}
