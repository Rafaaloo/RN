public class zadanie18 {
    public static void main(String[] args) {
        double kwotaZaAkcje, prowizja, lacznaKwota;

        kwotaZaAkcje = 600 * 21.77;
        prowizja = kwotaZaAkcje * 0.02;
        lacznaKwota = kwotaZaAkcje + prowizja;

        System.out.println("Kwota zapłacona za akcje: " + kwotaZaAkcje + "\nWysokość prowizji: " + prowizja + "\nŁączna zapłacona kwota: " + lacznaKwota);

    }
}
