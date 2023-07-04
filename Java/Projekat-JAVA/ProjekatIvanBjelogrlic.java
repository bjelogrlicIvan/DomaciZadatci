package projekat;

import java.util.Scanner;

public class ProjekatIvanBjelogrlic {
    //prva
    public static boolean find(String rec, String[] niz) {
        for (String element : niz) {
            if (element.equalsIgnoreCase(rec)) {
                System.out.println("Trazeni String je pronadjen u nizu.");
                return true;
            }
        }
        System.out.println("Trazeni String nije pronadjen u nizu.");
        return false;
    }

    //druga
    public static int[] unesiNiz(Scanner sc) {
        System.out.print("Unesite duzinu niza: ");
        int duzina = sc.nextInt();
        int[] niz = new int[duzina];
        System.out.println("Unesite brojeve: ");
        for (int i = 0; i < duzina; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static double[] pomnozenoSaPI(int[] brojevi) {
        double[] rezultat = new double[brojevi.length];
        for (int i = 0; i < brojevi.length; i++) {
            rezultat[i] = brojevi[i] * Math.PI;
        }
        System.out.println("Niz pomnozen sa Pi: ");
        for (int i = 0; i < rezultat.length; i++) {
            System.out.println(rezultat[i]);
        }
        return rezultat;
    }

    //treca
    public static String reverse(String rec) {
        String obrnuti = "";
        for (int i = rec.length() - 1; i >= 0; i--) {
            obrnuti += rec.charAt(i);
        }
        return obrnuti;
    }

    public static String[] unesiStringove(Scanner sc) {
        System.out.print("Unesi broj stringova: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] niz = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unesi string " + (i+1) + ": ");
            niz[i] = sc.nextLine();
        }
        return niz;
    }

    public static void ispisiObrnuteStringove(String[] niz) {
        for (String s : niz) {
            String obrnuti = reverse(s);
            System.out.println(obrnuti);
        }
    }

    //cetvrata
    public static void ispisiNizStringova(String[] niz) {
        System.out.println("Niz: ");
        for (String s : niz) {
            System.out.println(s);
        }
    }

    public static void replaceWith(String[] niz, String oldString, String newString) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equalsIgnoreCase(oldString)) {
                niz[i] = newString;
            }
        }
    }

    //peta
    public static void deljivSa(int broj) {
        System.out.println("Brojevi koji su deljivi sa " + broj + ":");
        for (int i = 1; i <= broj; i++) {
            if (broj % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int pretvoriUBroj(Scanner sc) {
        System.out.print("Unesi broj: ");
        String strBroj = sc.nextLine();
        int broj = 0;
        for (int i = 0; i < strBroj.length(); i++) {
            int cifra = Character.getNumericValue(strBroj.charAt(i));
            broj = broj * 10 + cifra;
        }
        return broj;
    }

    //sesti
    public static int[] unesiNiz(int duzinaNiza, Scanner sc) {
        int[] niz = new int[duzinaNiza];
        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < duzinaNiza; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static int[] najveci(int[] niz1, int[] niz2) {
        int duzinaRezultujucegNiza = Math.max(niz1.length, niz2.length);
        int[] najveci = new int[duzinaRezultujucegNiza];
        for (int i = 0; i < duzinaRezultujucegNiza; i++) {
            if (i >= niz1.length) {
                najveci[i] = niz2[i];
            } else if (i >= niz2.length) {
                najveci[i] = niz1[i];
            } else {
                if (niz1[i] > niz2[i]) {
                    najveci[i] = niz1[i];
                } else {
                    najveci[i] = niz2[i];
                }
            }
        }
        return najveci;
    }

    public static void ispisiNiz(int[] niz) {
        System.out.println("Rezultujuci niz: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i] + " ");
        }
    }

    //sedmi
    public static int[] unesiBrojeve(Scanner sc) {
        int[] niz = new int[6];
        System.out.println("Unesite 6 brojeva: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static int[] randomBrojevi() {
        int[] niz = new int[30];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = (int) (Math.random() * 100) + 1;
        }
        return niz;
    }

    public static void bingo(int[] korisnikoviBrojevi, int[] nasumicniBrojevi) {
        int brojPogodaka = 0;
        System.out.println("Nasumicni brojevi su:");
        for (int i = 0; i < nasumicniBrojevi.length; i++) {
            System.out.print(nasumicniBrojevi[i] + " ");
            for (int j = 0; j < korisnikoviBrojevi.length; j++) {
                if (nasumicniBrojevi[i] == korisnikoviBrojevi[j]) {
                    brojPogodaka++;
                    System.out.println("Pogodak broja " + korisnikoviBrojevi[j]);
                }
            }
        }
        System.out.println("Ukupno ste pogodili " + brojPogodaka + " brojeva.");
    }
    public static void main(String[] args) {
        //prva
        Scanner sc = new Scanner(System.in);
        String[] niz = unesiStringove(sc);
        System.out.print("Unesite String koji trazite: ");
        String trazeniString = sc.nextLine();
        boolean pronadjen = find(trazeniString, niz);

        //druga
        int[] nizBrojeva = unesiNiz(sc);
        double[] pomnozenoSaPi = pomnozenoSaPI(nizBrojeva);

        //treca
        String[] niz1 = unesiStringove(sc);
        ispisiObrnuteStringove(niz1);

        //cetvrta
        String[] niz2 = unesiStringove(sc);
        ispisiNizStringova(niz2);
        System.out.print("Unesi string koji zelis da zamenis: ");
        String stariString = sc.nextLine();
        System.out.print("Unesi string sa kojim zelis da ga zamenis: ");
        String noviString = sc.nextLine();
        replaceWith(niz2, stariString, noviString);
        ispisiNizStringova(niz2);

        //peta
        int broj = pretvoriUBroj(sc);
        deljivSa(broj);

        //sesti
        System.out.print("Unesite duzinu prvog niza: ");
        int duzinaNiza1 = sc.nextInt();
        int[] prviNiz = unesiNiz(duzinaNiza1, sc);
        System.out.print("Unesite duzinu drugog niza: ");
        int duzinaNiza2 = sc.nextInt();
        int[] drugiNiz = unesiNiz(duzinaNiza2, sc);
        int[] najveciRezulta = najveci(prviNiz, drugiNiz);
        ispisiNiz(najveciRezulta);

        //sedmi
        int[] korisnikoviBrojevi = unesiBrojeve(sc);
        int[] nasumicniBrojevi = randomBrojevi();
        bingo(korisnikoviBrojevi, nasumicniBrojevi);
    }
}
