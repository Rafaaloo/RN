import java.util.Scanner;

public class zadanie15 {

    public static void main(String[] args) {
        double cenaDet, zysk;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj cenę detaliczną płytki: ");
        cenaDet = dane.nextInt();
        dane.nextLine();

        zysk = cenaDet * 0.4;

        System.out.println("Zysk z produktu wynosi: " + zysk);
    }

}
