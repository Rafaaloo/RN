package IF;
import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        String wegetarian, weganin, bezglutenowiec;
        System.out.print("Czy któraś z osób jest na diecie wegetariańskiej?:(tak/nie) ");
        wegetarian = dane.nextLine().toLowerCase();

        System.out.print("Czy któraś z osób jest na diecie wegańskiej?:(tak/nie) ");
        weganin = dane.nextLine().toLowerCase();

        System.out.print("Czy któraś z osób jest na diecie bezglutenowej?:(tak/nie) ");
        bezglutenowiec = dane.nextLine().toLowerCase();

        System.out.println("Możecie się wybrać do następujących restauracji: ");

        if(wegetarian.equalsIgnoreCase("nie") && weganin.equalsIgnoreCase("nie") && bezglutenowiec.equalsIgnoreCase("nie")){
            System.out.println("- Luksowe Burgery u Jarka");
        }else if(wegetarian.equalsIgnoreCase("tak") && weganin.equalsIgnoreCase("nie") && bezglutenowiec.equalsIgnoreCase("tak")){
            System.out.println("- Pizzeria przy dworcowej");
            System.out.println("- Kawiarnia na Rogu");
            System.out.println("- Kuchnia u Szefa");
        }
        else if(wegetarian.equalsIgnoreCase("tak") && weganin.equalsIgnoreCase("tak") && bezglutenowiec.equalsIgnoreCase("tak")) {
            System.out.println("- Kawiarnia na Rogu");
            System.out.println("- Kuchnia u Szefa");
        }else if(wegetarian.equalsIgnoreCase("tak") && weganin.equalsIgnoreCase("nie") && bezglutenowiec.equalsIgnoreCase("nie")){
        System.out.println("- Włoskie specjały");
        }
    }
}
