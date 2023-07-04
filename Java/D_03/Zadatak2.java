package zadaca3;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stanje na racunu frime je: ");
        double company = sc.nextDouble();

        System.out.println("Broj radnika je: ");
        int workers = sc.nextInt();

        double payment = 0.0;

        for (int i = 0; i < workers; i++){
            payment += 100.0;
        }

        double remainingBalance = company - payment;

        if (remainingBalance < 0) {
            System.out.println("Nema dovoljno sredstava na racunu firme!");
        } else {
            System.out.println("Stanje na racunu firme nakon isplate je: " + remainingBalance + " din");
        }

    }
}
