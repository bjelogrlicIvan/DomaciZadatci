package zadaca2;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ime cveta koji zelite");
        String flower = sc.nextLine();
        double price = 50.0;

        if (flower.equals("Ruza")) {
            System.out.println("Imamo " + flower + " po ceni od: " + price + " dinara.");
        } else if (flower.equals("Zumbul")) {
            System.out.println("Imamo " + flower + " po ceni od: " + price * 1.4 + " dinara.");
        } else if (flower.equals("Orhideje")) {
            System.out.println("Imamo " + flower + " po ceni od: " + price * 3.5 + " dinara.");
        } else if (flower.equals("Bonzai")) {
            System.out.println("Imamo " + flower + " po ceni od: " + price * 10.5 + " dinara.");
        } else {
            System.out.println("Pogresan unos ili nepostoji cvet na lageru!");
        }


    }
}
