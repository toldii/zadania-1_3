import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main (String args[]) {
      
        // inicjalizacja zmiennych, poprzez wczytanie z klawiatury
        Scanner scanner = new Scanner(System.in);
 
         System.out.println("Podaj :pierwszą liczbe: ");
      double liczba  = myInput.nextInt();
        liczba = Math.sqrt(liczba);
 
        System.out.println("Podaj :drugą liczbe: ");
      double liczba1 = myInput.nextInt();
        liczba1 = Math.sqrt(liczba1);
      
      double wynik= liczba + liczba1;
       System.out.println("Suma pierwiastków to: ");

    }
}