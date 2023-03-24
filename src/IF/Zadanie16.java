package IF;
import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        int punkty = 0, ksiazki;

        System.out.print("Ile ksiązek zakupiłeś w tym miesiącu? ");
        ksiazki = dane.nextInt();
        if(ksiazki == 0){
            System.out.println("Nie przyzanano ci żadnych punktów.");
        } else if (ksiazki == 1) {
            punkty = 5;
            System.out.println("Przyznano Ci: " + punkty + "punktów.");
        }else if (ksiazki == 2) {
            punkty = 15;
            System.out.println("Przyznano Ci: " + punkty + "punktów.");
        }else if (ksiazki == 3) {
            punkty = 30;
            System.out.println("Przyznano Ci: " + punkty + "punktów.");
        }else {
            punkty = 60;
            System.out.println("Przyznano Ci: " + punkty + "punktów.");
        }
    }

}
