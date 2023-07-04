package zadaca12;

public class Tocak {
    private int trajanjeGume;
    private boolean ostecen;
    private double cena;

    public Tocak(int trajanjeGume, boolean ostecen, double cena) {
        this.trajanjeGume = trajanjeGume;
        this.ostecen = ostecen;
        this.cena = cena;
    }

    public int getTrajanjeGume() {
        return trajanjeGume;
    }

    public void setTrajanjeGume(int trajanjeGume) {
        this.trajanjeGume = trajanjeGume;
    }

    public boolean isOstecen() {
        return ostecen;
    }

    public void setOstecen(boolean ostecen) {
        this.ostecen = ostecen;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTrajanje gume = ").append(trajanjeGume)
                .append(", ostecen = ").append(ostecen)
                .append(", cena = ").append(cena);
        return sb.toString();
    }

}


