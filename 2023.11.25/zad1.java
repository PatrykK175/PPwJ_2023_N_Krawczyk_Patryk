import java.util.Random;
import java.util.Scanner;

public class zad1 {

  public static void generate(int tab[], int n, int minValue, int maxValue) {
    Random randomArray = new Random();
    for (int i = 0; i < n; i++) {
      tab[i] = randomArray.nextInt(maxValue - minValue + 1) + minValue;
    }
  }

  public static int ileNieparzystych(int[] tab) {
    int count = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] % 2 != 0) {
        count++;
      }
    }

    return count;
  }

  public static int ileParzystych(int[] tab) {
    int count = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] % 2 == 0) {
        count++;
      }
    }

    return count;
  }

  public static int ileDodatnich(int[] tab) {
    int count = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] > 0) {
        count++;
      }
    }

    return count;
  }

  public static int ileUjemnych(int[] tab) {
    int count = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] < 0) {
        count++;
      }
    }

    return count;
  }

  public static int ileZerowych(int[] tab) {
    int count = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] == 0) {
        count++;
      }
    }

    return count;
  }

  public static int ileMaksymalnych(int[] tab) {
      int max = tab[0];
      int count = 0;

      for (int i = 0; i < tab.length; i++) {
        if (tab[i] > max){
          max = tab[i];
          count = 1;
        } else if (tab[i] == max) {
          count++;
        }
      }

      return count;
  }

  public static int sumaDodatnich (int[] tab) {
    int count = 0;

    for (int i = 0; i < tab.length; i++) {
      if (tab[i] > 0) {
        count += tab[i];
      } 
    }

    return count;
  }

  public static int sumaUjemnych (int[] tab) {
    int count = 0;

    for (int i = 0; i < tab.length; i++) {
      if (tab[i] < 0) {
        count += tab[i];
      }
    }

    return count;
  }

  public static int dlugoscMaksymalnegoCiaguDodatnich (int[] tab) {
    
    int currentLength = 0;
    int maxLength = 0;

    for (int i = 0; i < tab.length; i++) {
      if (tab[i] > 0) {
        currentLength++;
      } else {
        maxLength = Math.max(maxLength, currentLength);
        currentLength = 0;
      }
    }

    maxLength = Math.max(maxLength, currentLength);

    return maxLength;
  }
  
  // nie ma informacji na temat tego co ma konkretnie zwracać ta funkcja

  // public static void signum(int[] tab) {
  //   for (int i = 0; i<tab.length; i++) {
  //     if (tab[i] > 0 ) {
  //       return 1;
  //     } else if (tab[i] < 0) {
  //       return -1;
  //     } else {
  //       return 0;
  //     }
  //   }
  // }

  public static void odwrocFragment(int[] tab, int lewy, int prawy) {
    while (lewy < prawy) {
      int temp = tab[lewy];
      tab[lewy] = temp;
      lewy++;
      prawy--;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj dlugosc tablicy: ");
    int lengthOfList = scanner.nextInt();

    System.out.print("Podaj poczatkowy zakres tablicy: ");
    int startArray = scanner.nextInt();

    System.out.print("Podaj koncowy zakres tablicy: ");
    int endArray = scanner.nextInt();

    int[] arr = new int[lengthOfList];

    generate(arr, lengthOfList, startArray, endArray);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    int oddCount = ileNieparzystych(arr);
    int evenCount = ileParzystych(arr);
    int plusCount = ileDodatnich(arr);
    int minusCount = ileUjemnych(arr);
    int zeroCount = ileZerowych(arr);
    int najwiekszaCount = ileMaksymalnych(arr);
    int sumaDodatnich = sumaDodatnich(arr);
    int sumaUjemnych = sumaUjemnych(arr);
    int dlugoscMaksymalnegoCiaguDodatnich = dlugoscMaksymalnegoCiaguDodatnich(arr);

    System.out.println("Ilosc nieparzystych liczb w tablicy: " + oddCount);
    System.out.println("Ilosc parzystych liczb w tablicy: " + evenCount);
    System.out.println("Ilosc dodanich liczb w tablicy: " + plusCount);
    System.out.println("Ilosc ujemnych liczb w tablicy: " + minusCount);
    System.out.println("Ilosc zerowych liczb w tablicy: " + zeroCount);
    System.out.println("Ilosc największych liczb w tablicy: " + najwiekszaCount);
    System.out.println("Suma dodatnich liczb w tablicy: " + sumaDodatnich);
    System.out.println("Suma ujemnych liczb w tablicy: " + sumaUjemnych);
    System.out.println("Długość maksymalnego ciągu dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich);
    
    scanner.close();
  }
}