public class Zadanie22 {
    public static void main(String[] args) {
        double kwotaZaAkcje, prowizja, lacznaKwota, kwotaZaSprzedaz, prowizja2, lacznakwota2, zysk;

        kwotaZaAkcje = 1000 * 32.87;
        prowizja = kwotaZaAkcje * 0.02;
        lacznaKwota = kwotaZaAkcje + prowizja;
        kwotaZaSprzedaz = 1000 * 33.92;
        prowizja2 = kwotaZaSprzedaz * 0.02;
        lacznakwota2 = kwotaZaSprzedaz + prowizja2;
        zysk = kwotaZaAkcje-kwotaZaSprzedaz;


        System.out.println("Kwota zapłacona za akcje: " + kwotaZaAkcje + "zł\nProwizja za zakup: "+prowizja+"zł\nKwota otrzymana: "+kwotaZaSprzedaz+"zł\nProwizja za sprzedaż: "+prowizja2+"zł\nStrata: "+zysk);

    }
}


