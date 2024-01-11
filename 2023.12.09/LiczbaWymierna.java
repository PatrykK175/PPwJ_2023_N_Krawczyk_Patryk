public class LiczbaWymierna {
    private int licznik;
    private int mianownik;

    public LiczbaWymierna(int licznik, int mianownik) {
        if (mianownik == 0) {
            throw new IllegalArgumentException("Mianownik nie może być równy 0.");
        }

        this.licznik = licznik;
        this.mianownik = mianownik;
        skroc();
    }

    public void wypisz() {
        System.out.printf("%d/%d%n", licznik, mianownik);
    }

    public void wypiszCalosc() {
        int calosc = licznik / mianownik;
        int reszta = licznik % mianownik;
        if (calosc != 0) {
            System.out.printf("%d %d/%d%n", calosc, reszta, mianownik);
        } else {
            System.out.printf("%d/%d%n", licznik, mianownik);
        }
    }

    public int nwd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public void skroc() {
        int gcd = nwd(licznik, mianownik);
        licznik /= gcd;
        mianownik /= gcd;
    }

    public LiczbaWymierna dodaj(LiczbaWymierna druga) {
        int nowyLicznik = this.licznik * druga.mianownik + druga.licznik * this.mianownik;
        int nowyMianownik = this.mianownik * druga.mianownik;
        return new LiczbaWymierna(nowyLicznik, nowyMianownik);
    }

    public LiczbaWymierna odejmij(LiczbaWymierna druga) {
        int nowyLicznik = this.licznik * druga.mianownik - druga.licznik * this.mianownik;
        int nowyMianownik = this.mianownik * druga.mianownik;
        return new LiczbaWymierna(nowyLicznik, nowyMianownik);
    }

    public LiczbaWymierna pomnoz(LiczbaWymierna druga) {
        int nowyLicznik = this.licznik * druga.licznik;
        int nowyMianownik = this.mianownik * druga.mianownik;
        return new LiczbaWymierna(nowyLicznik, nowyMianownik);
    }

    public static void main(String[] args) {
        LiczbaWymierna ulamek1 = new LiczbaWymierna(3, 4);
        LiczbaWymierna ulamek2 = new LiczbaWymierna(1, 2);

        System.out.println("Ulamek 1:");
        ulamek1.wypisz();

        System.out.println("Ulamek 2:");
        ulamek2.wypisz();

        LiczbaWymierna suma = ulamek1.dodaj(ulamek2);
        System.out.println("Suma:");
        suma.wypisz();

        LiczbaWymierna roznica = ulamek1.odejmij(ulamek2);
        System.out.println("Roznica:");
        roznica.wypisz();

        LiczbaWymierna iloczyn = ulamek1.pomnoz(ulamek2);
        System.out.println("Iloczyn:");
        iloczyn.wypisz();
    }

}
