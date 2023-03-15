import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        double przejechanekm, litrypaliwa, litrynakm;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj przejechane kilometry: ");
        przejechanekm = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj zużyte litry paliwa: ");
        litrypaliwa = dane.nextInt();
        dane.nextLine();

        litrynakm = przejechanekm / litrypaliwa;

        System.out.println("Spalanie: " + litrynakm + " l/km");
    }
}
