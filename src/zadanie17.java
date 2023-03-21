import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);

        double cenaPosilku, napiwek, podatek, doZaplaty;
        System.out.println("Podaj cenę posiłku: ");
        cenaPosilku = dane.nextInt();
        dane.nextLine();

        podatek = cenaPosilku * 0.0675;
        napiwek = cenaPosilku * 0.2;
        doZaplaty = cenaPosilku + podatek + napiwek;

        System.out.println("Cena posiłku: " + cenaPosilku + "\nWartość podatku: " + podatek + "\nWysokość napiwku: " + napiwek + "\nŁączna kwota do zapłaty: " + doZaplaty);


    }
}
