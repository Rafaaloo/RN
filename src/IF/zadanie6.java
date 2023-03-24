package IF;
import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        int sekundy, minuty, godziny, dni, sekundy2, minuty2, godziny2;
        System.out.println("Podaj liczbę sekund: ");
        sekundy = dane.nextInt();

        if(sekundy>60 && sekundy<3600){
        minuty = sekundy/60;
        sekundy2 = sekundy-minuty*60;
            System.out.println((sekundy + " sekund to " + minuty + " minut i " + sekundy2 + " sekund"));
       }else if (sekundy<86400){
            minuty = sekundy/60;
            godziny = minuty/60;
            minuty2 = minuty-godziny*60;
            sekundy2 = sekundy-minuty*60;
          System.out.println((sekundy + " sekund to " + godziny + " godzin, " + minuty2 + " minut, " + sekundy2 + "sekund"));
        } else if (sekundy>86400){
            minuty = sekundy/60;
            godziny = minuty/60;
            dni = godziny/24;
            godziny2 = godziny-dni*24;
            minuty2 = minuty-godziny*60;
            sekundy2 = sekundy-minuty*60;
            System.out.println((sekundy + " sekund to " + dni + " dni, " + godziny2 + " godzin, " + minuty2 + " minut, " + sekundy2 + "sekund"));

        };
    }
}
