package zadaca4;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti pozitivan broj N = ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Uneti broj je negativan! Unesite pozitivan broj N:");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
