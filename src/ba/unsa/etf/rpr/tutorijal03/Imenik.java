package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Imenik {
    private HashMap<String, TelefonskiBroj> popis;

    public Imenik() {
        popis = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        popis.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return popis.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {

        for (Map.Entry<String, TelefonskiBroj> a : popis.entrySet()) {
            if (a.getValue().equals(broj)) return a.getKey();
        }
        return "";
    }

    public String naSlovo(char s) {
        String novi = " ";
        int i = 1;
        for (Map.Entry<String, TelefonskiBroj> a : popis.entrySet()) {
            if (a.getKey().charAt(0) == s) {
                novi += i + a.getKey() + a.getValue().ispisi() + "\n";
                i++;
            }
        }
        return novi;
    }
    public Set<String> izGrada(Grad g){
        HashSet<String> novi=new HashSet<String>();
        for (Map.Entry<String, TelefonskiBroj> a : popis.entrySet()) {
            if (a.getValue().ispisi().substring(0,2)==(g.getPozivni())) novi.add(a.getKey());
        }
 return novi;
    }

}
