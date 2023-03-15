import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
    int dlugosc1, szerokosc1, dlugosc2, szerokosc2, pokoj1, pokoj2, calapowierzchnia;
        Scanner pokoje = new Scanner(System.in);

        System.out.println("Podaj długość pokoju 1: ");
        dlugosc1 = pokoje.nextInt();
        pokoje.nextLine();

        System.out.println("Podaj długość pokoju 1: ");
        szerokosc1 = pokoje.nextInt();
        pokoje.nextLine();

        System.out.println("Podaj długość pokoju 1: ");
        dlugosc2 = pokoje.nextInt();
        pokoje.nextLine();

        System.out.println("Podaj długość pokoju 1: ");
        szerokosc2 = pokoje.nextInt();
        pokoje.nextLine();

        pokoj1 = dlugosc1 * szerokosc1;
        pokoj2 = dlugosc2 * szerokosc2;
        calapowierzchnia = pokoj1 + pokoj2;

        System.out.println("Powierzchnia pokoju nr1 wynosi: " + pokoj1 + "m2" );
        System.out.println("Powierzchnia pokoju nr1 wynosi: " + pokoj2 + "m2" );
        System.out.println("Powierzchnia mieszkania wynosi: " + calapowierzchnia + "m2" );


    }
}
