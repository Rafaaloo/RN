import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        double zjedzoneCiastka, kalorie1Ciastka, kalorie;
        Scanner dane = new Scanner(System.in);

                kalorie1Ciastka = 300 / 4;

        System.out.println("Podaj ilość zjedzonych ciastek: ");
        zjedzoneCiastka = dane.nextInt();
        dane.nextLine();

        kalorie = zjedzoneCiastka * kalorie1Ciastka;
        System.out.println( zjedzoneCiastka +  " to: " + kalorie + " kalorie");

    }
}
