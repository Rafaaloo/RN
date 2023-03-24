package IF;

import java.util.Scanner;
public class Zadanie8 {
        public static void main(String[] args) {
            Scanner dane = new Scanner(System.in);

            double rabat, procent, zakup, pakiety, cena=99;
            System.out.println("Podaj ilość pakietów, które chcesz kupić: ");
            pakiety = dane.nextInt();

            if(pakiety>= 10 && pakiety <= 19) {
                rabat = 0.2;
                procent = rabat * 100;
                zakup =pakiety*cena-pakiety*cena*rabat;
                System.out.println("Przyznano ci: " + procent + "% rabatu." );
                System.out.println("Łączna kwota po rabacie wynosi: " + zakup + "zł");
            }else if(pakiety>= 20 && pakiety <= 49) {
                rabat = 0.3;
                procent = rabat * 100;
                zakup = pakiety*cena-pakiety*cena*rabat;
                System.out.println("Przyznano ci: " + procent + "% rabatu." );
                System.out.println("Łączna kwota po rabacie wynosi: " + zakup + "zł");
            }
            else if(pakiety>= 50 && pakiety <= 99) {
                rabat = 0.4;
                procent = rabat * 100;
                zakup = pakiety*cena-pakiety*cena*rabat;
                System.out.println("Przyznano ci: " + procent + "% rabatu." );
                System.out.println("Łączna kwota po rabacie wynosi: " + zakup + "zł");
            } else if(pakiety>= 100) {
                rabat = 0.5;
                procent = rabat * 100;
                zakup = pakiety*cena-pakiety*cena*rabat;
                System.out.println("Przyznano ci: " + procent + "% rabatu." );
                System.out.println("Łączna kwota po rabacie wynosi: " + zakup + "zł");
            } else {
                zakup = pakiety*cena;
                System.out.println("Łączna kwota sprzedaży wynosi: " + zakup+ "zł");
            }
        }

    }

