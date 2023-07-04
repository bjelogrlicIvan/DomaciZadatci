package zadaca6;

import java.util.Scanner;

public class zadatak2 {
    public static int[] unesiNiz(int n) {
        Scanner sc = new Scanner(System.in);
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite neki broj:");
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    static void ispisiNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i] + " ");
        }
        System.out.println();
    }

    static void elementiNiza(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Element: " + niz[i]);
        }
        System.out.println();
    }

    static int[] pretvoriNeparneUParne(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 != 0) {
                niz[i]++;
            }
        }
        return niz;
    }

    public static void main(String[] args) {
        /*a) Napraviti funkciju za ubacivanje celih brojeva u niz.
        U parametru metoda cemo imati broj koji predstavlja velicinu niza,
        unutar funkcije cemo ubacivati elemente u niz i vratiti konacan niz.
        b) Proci kroz zadati niz iz primera a) i svaki neparan broj pretvoriti u parni. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int n = sc.nextInt();

        int[] niz = unesiNiz(n);

        System.out.println("Elemnti niza su: ");
        elementiNiza(niz);

        System.out.println("Niz pre izmene: ");
        ispisiNiz(niz);

        int[] nizParnihBrojeva = pretvoriNeparneUParne(niz);

        System.out.println("Niz posle izmene: ");
        ispisiNiz(nizParnihBrojeva);
    }
}
