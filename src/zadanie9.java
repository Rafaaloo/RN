import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        String name;
        int age;
        double annualPay;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj imię i nazwisko: ");
        name = dane.nextLine();

        System.out.println("Podaj wiek: ");
        age = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj oczekiwany roczny dochód: ");
        annualPay = dane.nextDouble();
        dane.nextLine();

        System.out.println("Nazywam się " + name + ", mam " + age + "lat \ni chcę zarabiać " + annualPay + " złotych rocznie");
    }
}
