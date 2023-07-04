package Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        String name = "Ivan";
        String surname = "Bjelogrlic";
        int birthYear = 1984;
        int employmentYear = 2008;

        int currentYear = java.time.Year.now().getValue();
        int yearsOfWork = currentYear - employmentYear;

        System.out.println("Ime i prezime: " + name + " " + surname);
        System.out.println("Gorina rodjenja: " + birthYear);
        System.out.println("Godine radnog staza: " + yearsOfWork);
    }
}
