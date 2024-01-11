public class LiczbaZespolona {
    private double czescRzeczywista;
    private double czescUrojona;

    public LiczbaZespolona(double czescRzeczywista, double czescUrojona) {
        this.czescRzeczywista = czescRzeczywista;
        this.czescUrojona = czescUrojona;
    }

    public void wypisz() {
        System.out.printf("%.2f + %.2fi%n", czescRzeczywista, czescUrojona);
    }

    public LiczbaZespolona dodaj(LiczbaZespolona druga) {
        double nowaCzescRzeczywista = this.czescRzeczywista + druga.czescRzeczywista;
        double nowaCzescUrojona = this.czescUrojona + druga.czescUrojona;
        return new LiczbaZespolona(nowaCzescRzeczywista, nowaCzescUrojona);
    }

    public LiczbaZespolona odejmij(LiczbaZespolona druga) {
        double nowaCzescRzeczywista = this.czescRzeczywista - druga.czescRzeczywista;
        double nowaCzescUrojona = this.czescUrojona - druga.czescUrojona;
        return new LiczbaZespolona(nowaCzescRzeczywista, nowaCzescUrojona);
    }

    public LiczbaZespolona pomnoz(LiczbaZespolona druga) {
        double nowaCzescRzeczywista = this.czescRzeczywista * druga.czescRzeczywista -
                this.czescUrojona * druga.czescUrojona;
        double nowaCzescUrojona = this.czescRzeczywista * druga.czescUrojona +
                this.czescUrojona * druga.czescRzeczywista;
        return new LiczbaZespolona(nowaCzescRzeczywista, nowaCzescUrojona);
    }

    public static void main(String[] args) {
        LiczbaZespolona zespolona1 = new LiczbaZespolona(2.5, 3.0);
        LiczbaZespolona zespolona2 = new LiczbaZespolona(1.5, 2.0);

        System.out.println("Liczba zespolona 1:");
        zespolona1.wypisz();

        System.out.println("Liczba zespolona 2:");
        zespolona2.wypisz();

        LiczbaZespolona sumaZespolona = zespolona1.dodaj(zespolona2);
        System.out.println("Suma zespolona:");
        sumaZespolona.wypisz();

        LiczbaZespolona roznicaZespolona = zespolona1.odejmij(zespolona2);
        System.out.println("Roznica zespolona:");
        roznicaZespolona.wypisz();

        LiczbaZespolona iloczynZespolony = zespolona1.pomnoz(zespolona2);
        System.out.println("Iloczyn zespolony:");
        iloczynZespolony.wypisz();
    }
}
