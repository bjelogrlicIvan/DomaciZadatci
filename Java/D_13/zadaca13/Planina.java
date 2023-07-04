package zadaca13;

public class Planina {
    private String naziv;
    private int visina;

    public Planina(String naziv, int visina) {
        this.naziv = naziv;
        this.visina = visina;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getVisina() {
        return visina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime planine = ")
                .append(naziv).append('\'')
                .append(", visina = ").append(visina);
        return sb.toString();
    }
}
