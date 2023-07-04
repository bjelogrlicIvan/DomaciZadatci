package zadaca12;

import java.util.List;

abstract class MotornoVozilo {
    private List<Tocak> tockovi;
    private double cena;
    private int godinaProizvodnje;

    public MotornoVozilo(List<Tocak> tockovi, double cena, int godinaProizvodnje) {
        this.tockovi = tockovi;
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public List<Tocak> getTockovi() {
        return tockovi;
    }

    public void setTockovi(List<Tocak> tockovi) {
        this.tockovi = tockovi;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public abstract boolean daLiJeOStecen();

    public abstract void removeOstecenu();

    public abstract void ubaciRezervnu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTockovi:").append(tockovi.toString().substring(1, tockovi.toString().length() - 1))
                .append("\nCena = ").append(cena)
                .append("\nGodina proizvodnje = ").append(godinaProizvodnje);
        return sb.toString();
    }
}
