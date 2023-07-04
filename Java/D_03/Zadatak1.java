package zadaca3;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";
        String allStrings = "";

        while (!input.equals("stop")) {
            System.out.print("Unesite string (ili 'stop' da prekinete unos): ");
            input = sc.nextLine();
            if (!input.equals("stop")) {
                allStrings += input + "\n";
            }
        }

        System.out.println("Uneli ste sledeće stringove:");
        System.out.println(allStrings);
    }
}