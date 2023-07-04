package zadaca5;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*Na Zadatku 3 sa casa dodati funkcionalnost koja ispisuje koliko puta se neko ime pojavljuje u nizu*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj imena: ");
        int n = sc.nextInt();
        System.out.println("Uneti imena: ");
        String[] imena = new String[n];

        for (int i = 0; i < n ; i++) {
            imena[i] = sc.next();
        }
        sc.nextLine();
        System.out.println("Unesite ime koje trazite: ");
        String imeKojeTrazimo = sc.nextLine();

        int brojPonavljanja = 0;

        for (String ime: imena
             ) {
            if(ime.equalsIgnoreCase(imeKojeTrazimo)){
                brojPonavljanja++;
            }
        }
        if(brojPonavljanja > 0){
            System.out.println("Trazeno ime se ponavlja " + brojPonavljanja + " puta." );
        } else {
            System.out.println("Trazeno ime ne postoji u nizu");
        }
    }
}
