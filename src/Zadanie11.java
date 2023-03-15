import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        double wartoscproduktu, pStanowy = 0.02, pLokalny = 0.04, cena;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj cene: ");
        wartoscproduktu = dane.nextInt();
        dane.nextLine();

        pLokalny = pLokalny * wartoscproduktu;
        pStanowy = pStanowy * wartoscproduktu;

        cena = wartoscproduktu + pStanowy +  pLokalny;
        System.out.println("Wartość produktu wonosi: " + wartoscproduktu + "pln, podatek lokalny: " + pStanowy + "pln, podatek lokalny: " + pLokalny + "pln, łączna cena " + cena + "pln");



    }
}
