import java.util.Scanner;

public class zadanie14 {
    public static void main(String[] args){
        double test1, test2, test3, wynik;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj wynik pierwszego testu: ");
        test1 = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj wynik drugiego testu: ");
        test2 = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj wynik trzeciego testu: ");
        test3 = dane.nextInt();
        dane.nextLine();

        wynik = (test1+test2+test3)/3;
        System.out.println("Wynik 1 testu: " + test1 + "pkt, wynik 2 testu: " + test2 +"pkt, wynik 3 testu: " + test3 + "pkt");
        System.out.println("Średnia wynosi: " + wynik + "pkt");
    }
}
