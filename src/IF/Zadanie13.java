package IF;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        String pakiet;
        Double minuty, oplata;

        System.out.println("Wybierz pakiet(A, B, C): ");
        pakiet = dane.nextLine().toLowerCase();

        System.out.println("Podaj liczbę minut rozmów: ");
        minuty = dane.nextDouble();

        switch (pakiet) {
            case "a":
                if(minuty>=450) {
                    minuty = (minuty - 450) * 0.45;
                    oplata = 39.99+minuty;
                    System.out.printf("Opłata ze ten miesiąc wynosi: %.2f zł \n", oplata);
                }else {
                    oplata = 39.99;
                    System.out.printf("Opłata ze ten miesiąc wynosi: %.2f zł \n", oplata);
                }
                break;
            case "b":
                if(minuty>=900) {
                    minuty = (minuty - 900) * 0.40;
                    oplata = 59.99+minuty;
                    System.out.printf("Opłata ze ten miesiąc wynosi: %.2f zł \n", oplata);
                }else {
                    oplata = 59.99;
                    System.out.printf("Opłata ze ten miesiąc wynosi: %.2f zł \n", oplata);
                }
                break;
            case "c":
                oplata = 69.99;
                System.out.printf("Opłata ze ten miesiąc wynosi: %.2f zł \n", oplata);
                break;
            default:
                System.out.println("Pakiet nie istnieje");
                break;
        }
    }
}
