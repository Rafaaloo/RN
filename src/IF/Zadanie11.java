package IF;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        String biegacz1, biegacz2, biegacz3;
        double czas1, czas2, czas3;

        System.out.println("Nazwisko 1 biegacza: ");
        biegacz1 = dane.nextLine();

        System.out.println("Czas 1 biegacza: ");
        czas1 = dane.nextDouble();
        dane.nextLine();

        System.out.println("Nazwisko 2 biegacza: ");
        biegacz2 = dane.nextLine();

        System.out.println("Czas 2 biegacza: ");
        czas2 = dane.nextDouble();
        dane.nextLine();

        System.out.println("Nazwisko 3 biegacza: ");
        biegacz3 = dane.nextLine();

        System.out.println("Czas 3 biegacza: ");
        czas3 = dane.nextDouble();
        dane.nextLine();

        if (czas1 < czas2 && czas1<czas3){
            System.out.println("1."+biegacz1);
            if(czas2 > czas3){
                System.out.println("2."+biegacz2);
                System.out.println("3."+biegacz3);
            }else if (czas2 == czas3)
                System.out.println("2."+ biegacz2 + "," + biegacz3);
        }else if (czas1>czas2 && czas1>czas3) {
            System.out.println("1." + biegacz2);
            if (czas1 > czas3) {
                System.out.println("2." + biegacz1);
                System.out.println("3." + biegacz3);
            } else if (czas2 == czas3)
                System.out.println("2." + biegacz1 + "," + biegacz3);
        }else if (czas1>czas3 && czas2>czas3) {
            System.out.println("1." + biegacz3);
            if (czas1 > czas2) {
                System.out.println("2." + biegacz1);
                System.out.println("3." + biegacz2);
            } else if (czas2 == czas3)
                System.out.println("2." + biegacz2 + "," + biegacz2);
        }else if(czas1 == czas2 && czas1 == czas3){
            System.out.println("1."+biegacz1+", "+biegacz2+", "+biegacz3);
        }

    }
}
