package zadaca12;

import java.util.ArrayList;
import java.util.List;

public class Automobil extends MotornoVozilo {
    public Automobil(List<Tocak> tockovi, double cena, int godinaProizvodnje) {
        super(tockovi, cena, godinaProizvodnje);
    }

    @Override
    public boolean daLiJeOStecen() {
        for (Tocak tocak : getTockovi()) {
            if (tocak.getTrajanjeGume() > 365)
                tocak.setOstecen(true);
        }
        return false;
    }

    @Override
    public void removeOstecenu() {
        List<Tocak> noviTockovi = new ArrayList<>();
        for (Tocak tocak : getTockovi()) {
            if (!tocak.isOstecen())
                noviTockovi.add(tocak);
        }
        setTockovi(noviTockovi);
    }

    @Override
    public void ubaciRezervnu() {
        int brojTockova = getTockovi().size();
        if (brojTockova < 6) {
            for (int i = brojTockova; i < 6; i++) {
                getTockovi().add(new Tocak(0, false, 0));
            }
        }
    }
    @Override
    public String toString() {
        return "\nAutomobil " + super.toString();
    }
}
