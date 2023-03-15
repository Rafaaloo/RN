import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        String firstName, middleName, lastName;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        firstName = dane.nextLine();

        System.out.println("Podaj drugie imie: ");
        middleName = dane.nextLine();

        System.out.println("Podaj swoje nazwisko: ");
        lastName = dane.nextLine();

        char firstInitial = firstName. charAt(0), middleInitial = middleName.charAt(0), lastInitial = lastName.charAt(0);

        System.out.println("Twoje imię: " + firstName + ", drugie imię: " + middleName + ", nazwisko: " + lastName);
        System.out.println("Twoje inicjały: " + firstInitial + middleInitial + lastInitial);




    }
}
