package zadaca5;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*Definisati dva jednaka niza brojeva, kao rezultat vratiti niz gde ce se sabrati svi elementi sa istim indeksima.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti duzinu niza: ");
        int n = sc.nextInt();

        int[] niz1 = new int[n];
        int[] niz2 = new int[n];
        int[] nizSabrano = new int[n];

        System.out.println("Uneti vrednosti prvog niza: ");
        for (int i = 0; i < n; i++) {
            niz1[i] = sc.nextInt();
        }

        System.out.println("Uneti vrednosti drugog niza: ");
        for (int i = 0; i < n; i++) {
            niz2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nizSabrano[i] = niz1[i] + niz2[i];
        }

        System.out.print("Niz sa sabranim elementima: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nizSabrano[i] + " ");
        }
    }
}
