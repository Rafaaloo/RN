import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        String miasto, male, duze, pierwsza;
        int dlugosc;
        System.out.println("Podaj nazwe ulubionego miasta: ");
        miasto = dane.nextLine();

        male = miasto.toLowerCase();
        duze = miasto.toUpperCase();

        dlugosc = miasto.length();
        pierwsza = String.valueOf(miasto.charAt(0));

        System.out.println(" Liczba znaków: " + dlugosc + "\n Nazwa zapisana dużymi literami: " + duze + "\n Nazwa zapisana małymi literami: " + male + "\n Pierwszy znak nazwy miasta: " + pierwsza);
    }
}
