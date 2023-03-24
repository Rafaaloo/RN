package IF;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        String pakiet;
        Double minuty, oplata,oplata2, oszczednosc;

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
                    if(minuty<=900){
                        oplata2 = 59.99;
                        oszczednosc = oplata-oplata2;
                        System.out.printf("Kupując pakiet B zaosczędziłbyś: %.2f zł \n", oszczednosc);
                    }else if (minuty>900){
                        oplata2 = 69.90;
                        oszczednosc = oplata-oplata2;
                        System.out.printf("Kupując pakiet B zaosczędziłbyś: %.2f zł \n", oszczednosc);
                    }
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
                     if (minuty<900){
                        oplata2 = 69.90;
                        oszczednosc = oplata-oplata2;
                        System.out.printf("Kupując pakiet C zaosczędziłbyś: %.2f zł \n", oszczednosc);
                    }
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
