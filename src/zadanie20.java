import java.util.Scanner;
public class zadanie20 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        double cukier, maslo, maka, ciasteczka, porcje;

        System.out.println("Ile ciasteczek chcesz upiec?: ");
        ciasteczka = dane.nextInt();

        porcje = ciasteczka/48;
        cukier = 1.5*porcje;
        maslo = 1*porcje;
        maka = 2.75*porcje;

        System.out.println("Na " + ciasteczka + " ciasteczek potrzebujesz:\n" + cukier + " Szklanki cukru\n" + maslo + " Szklanki masła\n" + maka + " Szklanki mąki");
    }
}
