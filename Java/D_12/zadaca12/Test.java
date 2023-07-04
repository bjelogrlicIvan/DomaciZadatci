package zadaca12;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Tocak> tockoviKamiona = new ArrayList<>();
        tockoviKamiona.add(new Tocak(200, false, 150));
        tockoviKamiona.add(new Tocak(110, false, 150));
        tockoviKamiona.add(new Tocak(130, false, 150));
        tockoviKamiona.add(new Tocak(140, false, 150));
        tockoviKamiona.add(new Tocak(90, false, 150));
        tockoviKamiona.add(new Tocak(80, false, 150));
        tockoviKamiona.add(new Tocak(70, false, 150));
        tockoviKamiona.add(new Tocak(120, false, 150));

        Kamion kamion = new Kamion(tockoviKamiona, 20000, 2000);
        kamion.daLiJeOStecen();
        System.out.println(kamion);

        kamion.removeOstecenu();
        System.out.println("\nBez ostecenih tockova:" + kamion);

        kamion.ubaciRezervnu();
        System.out.println("\nSa rezervnim gumama:" + kamion);

        List<Tocak> tockoviAutomobila = new ArrayList<>();
        tockoviAutomobila.add(new Tocak(500, false, 100));
        tockoviAutomobila.add(new Tocak(250, false, 100));
        tockoviAutomobila.add(new Tocak(300, false, 100));
        tockoviAutomobila.add(new Tocak(400, false, 100));
        tockoviAutomobila.add(new Tocak(350, false, 100));
        tockoviAutomobila.add(new Tocak(320, false, 100));

        Automobil automobil = new Automobil(tockoviAutomobila, 10000, 2021);
        automobil.daLiJeOStecen();
        System.out.println(automobil);

        automobil.removeOstecenu();
        System.out.println("\nBez ostecenih tockova:" + automobil);

        automobil.ubaciRezervnu();
        System.out.println("\nSa rezervnim gumama:" + automobil);

        List<Tocak> tockoviMotora = new ArrayList<>();
        tockoviMotora.add(new Tocak(220, false, 50));
        tockoviMotora.add(new Tocak(180, false, 50));

        Motor motor = new Motor(tockoviMotora, 5000, 2019);
        motor.daLiJeOStecen();
        System.out.println(motor);

        motor.removeOstecenu();
        System.out.println("\nBez ostecenih tockova:" + motor);

        motor.ubaciRezervnu();
        System.out.println("\nSa rezervnim gumama:" + motor);
    }
}
