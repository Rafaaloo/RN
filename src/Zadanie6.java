public class Zadanie6 {
    public static void main(String[] args) {
        int pomieszczenie12, pomieszczenie3, pomieszczenie4, calaPowierzchnia;
        float naJednaOsobe;
        pomieszczenie12 = 3 * 4;
        pomieszczenie3 = 2 * 3;
        pomieszczenie4 = 2 * 2;
        calaPowierzchnia = pomieszczenie12 * 2 + pomieszczenie3 + pomieszczenie4;
        naJednaOsobe = calaPowierzchnia / 4;
        System.out.println("Na jedną osobe przypada: " + naJednaOsobe + "m2");

    }
}
