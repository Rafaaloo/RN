import java.util.Scanner;
public class Zadanie21 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        double p, a, r, n, t , k1, k2, k3, k4;
        System.out.println("Wprowadź następujące dane:\nKwota zdeponowana: ");
        p = dane.nextInt();
        dane.nextLine();

        System.out.println("Roczna stopa: ");
        r = dane.nextInt();
        dane.nextLine();

        System.out.println("Kapitalizacja: ");
        n = dane.nextInt();
        dane.nextLine();

        System.out.println("Liczba lat: ");
        t = dane.nextInt();
        dane.nextLine();

        k1 = 1+r/n;
        k2 = n*t;
        k3 = Math.pow(k1, k2);
        k4 = p * k3;
        a = Math.round(k4);

        System.out.println("Kwota, która znajdzie się na koncie po " + t + " lat to: " + a);

    }
}
