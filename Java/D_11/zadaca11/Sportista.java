package zadaca11;

import java.util.Objects;

class Sportista {
    private String ime;
    private String jmbg;
    private double plata;


    public Sportista(String ime, String jmbg, double plata) {
        this.ime = ime;
        this.jmbg = jmbg;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportista sportista = (Sportista) o;
        return Double.compare(sportista.plata, plata) == 0 && Objects.equals(ime, sportista.ime) && Objects.equals(jmbg, sportista.jmbg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, jmbg, plata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ").append(ime).append(" ").append("JMBG: ").append(jmbg).append(" ").append("Plata: ").append(plata);
        return sb.toString();
    }
}