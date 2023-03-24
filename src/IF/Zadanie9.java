package IF;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);

        double stawka = 0, waga, odleglosc, koszt, zaplataKm;

        System.out.println("Podaj wagę paczki: ");
        waga = dane.nextDouble();
        dane.nextLine();

        System.out.println("Podaj odległość przesyłki: ");
        odleglosc = dane.nextDouble();
        dane.nextLine();

        if(waga<=1){
            stawka = 1.1;
        }else if (waga<=3){
            stawka = 2.2;
        }else if (waga<=5){
            stawka = 3.7;
        }else{
            stawka = 3.8;
        }


            zaplataKm = odleglosc/500;
            if(odleglosc%500!=0) {
                zaplataKm = zaplataKm = zaplataKm + 1;

            }
            koszt = stawka *zaplataKm;
        System.out.printf("Koszt przesyłki wynosi %.2f zł \n", koszt);


    }
}
