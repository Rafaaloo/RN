import java.util.Scanner;
public class Zadanie23 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        double V, R, E, S, K1;

        System.out.println("Podaj:\nDługość rzędu: ");
        R = dane.nextDouble();
        dane.nextLine();

        System.out.println("Ilość miejsca zajmowanego przez okratowanie w metrach: ");
        E = dane.nextDouble();
        dane.nextLine();

        System.out.println("Odległość między sadzonkami w metrach: ");
        S = dane.nextDouble();
        dane.nextLine();

        K1 = R-2*E;
        V = K1/S;

        System.out.println("W rzędzie zmieści się: "+V+" sadzonek");


    }
}
