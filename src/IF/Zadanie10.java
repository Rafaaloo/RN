package IF;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);

        double kalorie, tluszcz, kalorieTl, kalorieL, procent;

        System.out.println("Podaj liczbę kalori: ");
        kalorie = dane.nextDouble();
        dane.nextLine();

        System.out.println("Podaj gramy tłuszczu: ");
        tluszcz = dane.nextDouble();
        dane.nextLine();

        kalorieTl = tluszcz * 9;

        if(kalorieTl>kalorie){
            System.out.println("Dane są nieprawidłowe");
        }else {
            procent = kalorieTl / (kalorie + kalorieTl)*100;
            System.out.printf("Koszt przesyłki wynosi %.2f procent \n", procent);
            if(procent<30){
                System.out.println("Produkt jest niskotłuszczowy");
            }
        }


    }

}
