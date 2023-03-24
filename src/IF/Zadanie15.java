package IF;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        double czek, oplata;

        System.out.println("Ile czeków wystawiono w tym miesiącu?: ");
        czek = dane.nextDouble();

        if(czek<20){
            oplata = czek*0.1;
            System.out.printf("Opłata za wystawienie czeków wynosi: %.2f zł \n", oplata);
        }else if(czek<=39){
            oplata = czek*0.08;
            System.out.printf("Opłata za wystawienie czeków wynosi: %.2f zł \n", oplata);
        }
        else if(czek<=59){
            oplata = czek*0.06;
            System.out.printf("Opłata za wystawienie czeków wynosi: %.2f zł \n", oplata);
        }
        else{
            oplata = czek*0.04;
            System.out.printf("Opłata za wystawienie czeków wynosi: %.2f zł \n", oplata);
        }

    }
}
