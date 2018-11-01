package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;
import java.util.Set;

import static ba.unsa.etf.rpr.tutorijal03.Grad.BIHAC;
import static ba.unsa.etf.rpr.tutorijal03.Grad.SARAJEVO;

public class Main {
    public static TelefonskiBroj unos() {


        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite zeljenu vrstu broja:\n " +
                "1. Fiksni broj\n" +
                "2. Mobilni broj\n" +
                "3. Medunardni broj\n"

        );
        int g = ulaz.nextInt();
        TelefonskiBroj result=null;
        switch (g) {
            case 1:
            {
                System.out.println("Unesite zeljeni grad i broj\n");
                String grad = ulaz.next();
                String broj = ulaz.next();
                FiksniBroj a = new FiksniBroj(Grad.valueOf(grad), broj);
                System.out.println("Ako zelite ispisati uneseni broj, unesite 1");
                int m = ulaz.nextInt();
                if (m == 1) a.ispisi();
                result = a; break;}


            case 2:
            {System.out.println("Unesite mobilnu mrezu i broj\n");
                int mreza = ulaz.nextInt();
                String broj = ulaz.next();
                MobilniBroj a = new MobilniBroj(mreza, broj);
                System.out.println("Ako zelite ispisati uneseni broj, unesite 1");
                int m = ulaz.nextInt();
                if (m == 1) a.ispisi();
                result = a; break;}


            case 3:
            { System.out.println("Unesite drzavu i broj\n");
                String drzava = ulaz.next();
                String broj = ulaz.next();
                MedunarodniBroj a = new MedunarodniBroj(drzava, broj);
                System.out.println("Ako zelite ispisati uneseni broj, unesite 1");
                int m = ulaz.nextInt();
                if (m == 1) a.ispisi();
                result = a; break;}
        }



        return result;

    }


    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
int n=-1;
do{
        System.out.println(
                "Unesite broj zeljene operacije:\n " +
                        "1. Dodaj u imenik\n" +
                        "2. Daj broj osobe sa odredjenim imenom \n" +
                        "3. Daj ime osobe sa odredjenim brojem \n" +
                        "4. Osobe sa imenom na odredjeno slovo\n" +
                        "5. Osobe iz odredjenog grada\n" +
                        "6. Brojevi iz grada \n"+
                         "7.Kraj"

        );

         n = ulaz.nextInt();
        Imenik imenik = new Imenik();
        switch (n) {
            case 7: break;
            case 1:{
                System.out.println("Unesite ime osobe\n");
                String ime = ulaz.next();
                TelefonskiBroj a = unos();
                imenik.dodaj(ime, (FiksniBroj)a); break;}

            case 2:{
                System.out.println("Unesite ime osobe\n");
                String ime = ulaz.next();
                System.out.println(imenik.dajBroj(ime)); break;}
            case 3:
            {
                TelefonskiBroj b = unos();
                System.out.println(imenik.dajIme(b)); break;}

            case 4:{
                System.out.println("Unesite slovo koje zelite ");
                char slovo = ulaz.next().trim().charAt(0);
                System.out.println(imenik.naSlovo(slovo)); break;}
            case 5:{
                System.out.println("Unesite grad koji zelite ");
                String grad = ulaz.next();
                Set<String> a = imenik.izGrada(Grad.valueOf(grad));
                for (String b : a) System.out.println(b + '\n'); break;}

            case 6:
            { System.out.println("Unesite grad koje zelite ");
                String grad = ulaz.next();

                Set<TelefonskiBroj> a = imenik.izGradaBrojevi(Grad.valueOf(grad));
                for (TelefonskiBroj b : a) System.out.println(b.ispisi() + '\n'); break;}


        }

    }while(n!=7);
}}