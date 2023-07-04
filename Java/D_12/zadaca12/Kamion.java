package zadaca12;

import java.util.ArrayList;
import java.util.List;

public class Kamion extends MotornoVozilo {
    public Kamion(List<Tocak> tockovi, double cena, int godinaProizvodnje) {
        super(tockovi, cena, godinaProizvodnje);
    }

    @Override
    public boolean daLiJeOStecen() {
        for (Tocak tocak : getTockovi()) {
            if (tocak.getTrajanjeGume() > 120)
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
        if (brojTockova < 8) {
            for (int i = brojTockova; i < 8; i++) {
                getTockovi().add(new Tocak(0, false, 0));
            }
        }
    }
    @Override
    public String toString() {
        return "\nKamion " + super.toString();
    }
}
