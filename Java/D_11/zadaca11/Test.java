package zadaca11;

public class Test {
    public static void main(String[] args) {
        Sportista sportista1 = new Sportista("Marko", "1111111111111", 5000);
        Sportista sportista2 = new Sportista("Nikola", "2222222222222", 6000);
        Sportista sportista3 = new Sportista("Jovan", "3333333333333", 4000);

        Manchester manchester = new Manchester("Manchester", 100000);
        manchester.dodajSportistu(sportista1);
        manchester.dodajSportistu(sportista2);
        manchester.dodajSportistu(sportista3);

        System.out.println(manchester.toString());
        System.out.println("Budzet nakon isplate plata: " + manchester.isplati());
        System.out.println("Prosecna plata: " + manchester.prosecnoPlaceni());
        manchester.removePreplaceni();
        System.out.println("\nNakon uklanjanja preplacenih sportista:");
        System.out.println(manchester.toString());
        System.out.println("Budzet nakon isplate plata: " + manchester.isplati());
        System.out.println("Prosecna plata: " + manchester.prosecnoPlaceni());
        System.out.println("======================================================");

        Arsenal arsenal = new Arsenal("London", 80000);
        arsenal.dodajSportistu(sportista1);
        arsenal.dodajSportistu(sportista2);
        arsenal.dodajSportistu(sportista3);

        System.out.println(arsenal.toString());
        System.out.println("Budzet nakon isplate plata: " + arsenal.isplati());
        System.out.println("Prosecna plata: " + arsenal.prosecnoPlaceni());
        arsenal.removePreplaceni();
        System.out.println("\nNakon uklanjanja preplacenih sportista:");
        System.out.println(arsenal.toString());
        System.out.println("Budzet nakon isplate plata: " + arsenal.isplati());
        System.out.println("Prosecna plata: " + arsenal.prosecnoPlaceni());
        System.out.println("======================================================");

        Spartak spartak = new Spartak("Moskva", 60000);
        spartak.dodajSportistu(sportista1);
        spartak.dodajSportistu(sportista2);
        spartak.dodajSportistu(sportista3);

        System.out.println(spartak.toString());
        System.out.println("Budzet nakon isplate plata: " + spartak.isplati());
        System.out.println("Prosecna plata: " + spartak.prosecnoPlaceni());
        spartak.removePreplaceni();
        System.out.println("\nNakon uklanjanja preplacenih sportista: ");
        System.out.println(spartak.toString());
        System.out.println("Budzet nakon isplate plata: " + spartak.isplati());
        System.out.println("Prosecna plata: " + spartak.prosecnoPlaceni());

    }
}
