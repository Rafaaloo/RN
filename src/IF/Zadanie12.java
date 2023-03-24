package IF;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        String nosnik;
        double odleglosc, czas = 0;


        System.out.println("Wybierz nosnik(Powietrze, Woda, Stal): ");
        nosnik = dane.nextLine().toLowerCase();

        System.out.println("Podaj odległość(w metrach): ");
        odleglosc = dane.nextDouble();

        switch (nosnik) {
            case "powietrze":
                czas = odleglosc/343;
                System.out.printf("Czas potrzebny do pokonania odległości przez dźwięk wynosi: %.2f sekund \n", czas);
                break;
            case "woda":
                 czas = odleglosc/1490;
                System.out.printf("Czas potrzebny do pokonania odległości przez dźwięk wynosi: %.2f sekund \n", czas);
                break;
            case "stal":
                 czas = odleglosc/5100;
                System.out.printf("Czas potrzebny do pokonania odległości przez dźwięk wynosi: %.2f sekund \n", czas);
                break;
            default:
                System.out.println("Nie można określić nośnika");
                break;
        }
    }
}
