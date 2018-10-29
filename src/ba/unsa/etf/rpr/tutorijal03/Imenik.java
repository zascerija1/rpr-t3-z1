package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik  {
   private HashMap<String,TelefonskiBroj> popis;
   public Imenik(){
        popis=new HashMap<>();
    }
    public void dodaj(String ime, TelefonskiBroj broj){
        popis.put(ime,broj);
    }
    public String dajBroj(String ime){
        return popis.get(ime).ispisi();
    }


}
