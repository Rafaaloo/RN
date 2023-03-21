public class zadanie19 {
    public static void main(String[] args) {
        double jedenTyg, smakCyt, ankietowani = 12467;
        jedenTyg = ankietowani * 0.14;
        smakCyt = ankietowani * 0.64;


        System.out.println("Przybliżona liczba ankietowanych osób, które kupują przynajmniej jeden napój energetyczny tygodniowo: " + jedenTyg);
        System.out.println("Przybliżona liczba ankietowanych osób, które preferują napoje energetyczne o smaku cytrusowym: " + smakCyt);

    }
}
