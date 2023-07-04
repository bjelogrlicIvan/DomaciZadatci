package zadaca2;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hourlyRate;
        System.out.println("Unesi vrednost satnice (zarada po satu rada): ");
        hourlyRate = sc.nextDouble();

        double workingHours;
        System.out.println("Unesi broj radnih sati: ");
        workingHours = sc.nextDouble();

        System.out.println("Satnica je: " + hourlyRate);
        System.out.println("Broj radnih sati je: " + workingHours);

        if (hourlyRate > 0 && workingHours > 0) {
            System.out.println("Vasa plata je: " + hourlyRate * workingHours);
        } else {
            System.out.println("Neispravno uneti podatci. Nije dozvoljeno unosenje negativnih vrednosti, jer plata ne moze biti negativna!");
        }

    }
}
