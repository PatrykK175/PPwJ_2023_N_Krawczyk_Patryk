public class MojaData {

  private int dzien;
  private int miesiac;
  private int rok;

  public MojaData(int dzien, int miesiac, int rok) {
    this.dzien = dzien;
    this.miesiac = miesiac;
    this.rok = rok;
  }

  public void wypiszDate() {
    System.out.printf("%02d.%02d.%02d%n", dzien, miesiac, rok);
  }

  public void nastepnyDzien() {
    dzien++;
    if (dzien > liczbaDniWMiesiacu()) {
      dzien = 1;
      miesiac++;
      if (miesiac > 12) {
        miesiac = 1;
        rok++;
      }
    }
  }

  public void poprzedniDzien() {
    dzien--;
    if (dzien < 1) {
      miesiac--;
      if (miesiac < 1) {
        miesiac = 12;
        rok--;
      }
      dzien = liczbaDniWMiesiacu();
    }
  }

  public int dzienRoku() {
    int dzienRoku = dzien;
    for (int i = 1; i < miesiac; i++) {
      dzienRoku += liczbaDniWMiesiacu(i);
    }
    return dzienRoku;
  }

  public boolean czyPrzestepny() {
    return (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);
  }

  public int roznicaDni(MojaData innaData) {
    int dni = 0;

    while (!porownaj(innaData)) {
      nastepnyDzien();
      dni++;
    }

    return dni;
  }

  private int liczbaDniWMiesiacu() {
    return liczbaDniWMiesiacu(miesiac);
  }

  private int liczbaDniWMiesiacu(int miesiac) {
    switch (miesiac) {
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        return czyPrzestepny() ? 29 : 28;
      default:
        return 31;
    }
  }

  public boolean porownaj(MojaData innaData) {
    return (
      this.dzien == innaData.dzien &&
      this.miesiac == innaData.miesiac &&
      this.rok == innaData.rok
    );
  }

  public static void main(String[] args) {
    MojaData data = new MojaData(28, 2, 2023);

    System.out.println("Data: ");
    data.wypiszDate();

    data.nastepnyDzien();
    System.out.println("Następny dzień: ");
    data.wypiszDate();

    data.poprzedniDzien();
    System.out.println("Poprzedni dzień: ");
    data.wypiszDate();

    System.out.println("Numer dnia w roku: " + data.dzienRoku());

    System.out.println("Czy rok przestępny? " + data.czyPrzestepny());

    MojaData innaData = new MojaData(1, 3, 2023);
    System.out.println("Różnica dni: " + data.roznicaDni(innaData));
  }
}
