public class zegarek {
    private int godziny;
    private int minuty;
    private int sekundy;

    public zegarek(int godziny, int minuty, int sekundy) {
        ustawCzas(godziny, minuty, sekundy);
    }

    public void ustawCzas(int godziny, int minuty, int sekundy) {
        if (czyPoprawnyCzas(godziny, minuty, sekundy)) {
            this.godziny = godziny;
            this.minuty = minuty;
            this.sekundy = sekundy;
        } else {
            System.out.print("Niepoprawny format czasu.");
        }
    }

    public void wypiszCzas() {
        System.out.printf("%02d:%02d:%02d%n", godziny, minuty, sekundy);
    }

    public int liczbaMinutOdPolnocy() {
        return godziny * 60 + minuty;
    }

    public void zmienFormatCzasu(boolean format24h) {
        if (format24h) {
            if (godziny >12) {
                godziny -= 12;
            }
        } else {
            if (godziny == 12) {
                godziny = 0;
            }
            if (czyPM()) {
                godziny += 12;
            }
        }
    }

    public void zmienCzas(int iloscSekund) {
        int nowaSumaSekund = godziny * 3600 + minuty * 60 + iloscSekund;

        godziny = (nowaSumaSekund / 3600) % 24;
        minuty = (nowaSumaSekund % 3600) /60;
        sekundy = nowaSumaSekund % 60;
    }

    private boolean czyPoprawnyCzas(int godziny, int minuty, int sekundy) {
        return  (godziny >= 0 && godziny < 24) &&
                (minuty >= 0 && minuty < 60) &&
                (sekundy >= 0 && sekundy < 60);
    }

    private boolean czyPM() {
        return godziny >= 12;
    }

    public static void main(String[] args) {
        zegarek zegarek = new zegarek(15, 30, 45);

        System.out.println("Czas w formacie 24h:");
        zegarek.wypiszCzas();

        System.out.println("Liczba minut od godziny 12:00 AM: " + zegarek.liczbaMinutOdPolnocy());

        zegarek.zmienFormatCzasu(false);
        System.out.println("Czas w formacie 12h:");
        zegarek.wypiszCzas();

        zegarek.zmienCzas(120);
        System.out.println("Czas po zmianie o 2 minuty:");
        zegarek.wypiszCzas();
    }
}
