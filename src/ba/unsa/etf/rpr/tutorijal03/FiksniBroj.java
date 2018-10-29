package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    private String broj="";

    public FiksniBroj(Grad grad, String broj){
        String[] niz={"037","031","035","032","038","030","036","039","033","034"};
        for(int i=0;i<10;i++) if(i==grad.getIndeks()) this.broj+=niz[i];
this.broj+="/"+broj;


    }

    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int hashCode() {
        return broj.hashCode();
    }
}
