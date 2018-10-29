package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    String broj;

    public FiksniBroj(Grad grad, String broj){

        for(int i=0;i<10;i++) if(i==grad.getIndeks()) this.broj=grad.getPozivni();
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
