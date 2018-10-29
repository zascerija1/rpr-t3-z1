package ba.unsa.etf.rpr.tutorijal03;

public enum Grad {
    BIHAĆ(0), ORAŠJE(1),TUZLA(2),ZENICA(3),GORAŽDE(4),TRAVNIK(5),MOSTAR(6),ŠIROKI_BRIJEG(7),SARAJEVO(8),LIVNO(9);
private String[] niz={"037","031","035","032","038","030","036","039","033","034"};

    private final int indeks;

   Grad (int indeks) {
        this.indeks = indeks;
    }
    int getIndeks(){
        return this.indeks;
    }

    String getPozivni(){
        return niz[indeks];
    }
}




