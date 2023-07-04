package zadaca10;

public class Test {
    public static void main(String[] args) {
        Masinovodja masinovodja = new Masinovodja("Marko", 20, 10);
        Fizikalac fizikalac = new Fizikalac("Jovan", 45, 8);
        SefSmene sefSmene = new SefSmene("Petar", 55, 15, 500);

        System.out.println(masinovodja);

        System.out.println(fizikalac);

        System.out.println(sefSmene);
    }
}
