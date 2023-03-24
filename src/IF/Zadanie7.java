package IF;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        String imie1, imie2, imie3;
        System.out.println("Podaj pierwsze imię: ");
        imie1 = dane.nextLine();

        System.out.println("Podaj pierwsze imię: ");
        imie2 = dane.nextLine();

        System.out.println("Podaj pierwsze imię: ");
        imie3 = dane.nextLine();

        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0 ){
            System.out.println(imie1);
            if(imie2.compareToIgnoreCase(imie3) < 0){
                System.out.println((imie2));
            }System.out.println((imie3));
        }

        else if (imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3) < 0) {
            System.out.println(imie2);
            if(imie1.compareToIgnoreCase(imie3) < 0){
                System.out.println((imie1));
            }System.out.println((imie3));
        }

        else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) < 0) {
            System.out.println(imie3);
            if(imie1.compareToIgnoreCase(imie2) < 0){
                System.out.println((imie1));
            }System.out.println((imie2));
        }


    }
}
