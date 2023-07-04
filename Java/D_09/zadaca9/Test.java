package zadaca9;

public class Test {
    public static void main(String[] args) {
        zadaca9.Departman departman1 = new zadaca9.Departman("Informatika", 100, 10);
        zadaca9.Departman departman2 = new zadaca9.Departman("Matematika", 80, 8);
        zadaca9.Departman departman3 = new zadaca9.Departman("Biologija", 60, 6);

        zadaca9.Fakultet fakultet = new Fakultet("Univerzitet u Beogradu" );
        fakultet.dodajDepartman(departman1);
        fakultet.dodajDepartman(departman2);
        fakultet.dodajDepartman(departman3);

        System.out.println("Ukupan broj ucenika: " + fakultet.ukupanBrojUcenika());

        fakultet.dodavanjePredmeta();

        System.out.println(fakultet);
    }
}
