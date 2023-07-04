package zadaca10;

class SefSmene extends Radnik {
    private double nedeljniBonus;

    public SefSmene(String ime, double brojOdradjenihSati, double satnica, double nedeljniBonus) {
        super(ime, brojOdradjenihSati, satnica);
        this.nedeljniBonus = nedeljniBonus;
    }

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public double ukupnaZarada() {
        return super.ukupnaZarada() + nedeljniBonus;
    }

    @Override
    public boolean jeNaOdmoru() {
        return getBrojOdradjenihSati() >= 50;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sef Smene: ").append(getIme()).append("\n");
        sb.append("Broj odradjenih sati: ").append(getBrojOdradjenihSati()).append("\n");
        sb.append("Satnica: ").append(getSatnica()).append("\n");
        sb.append("Nedeljni bonus: ").append(nedeljniBonus).append("\n");
        sb.append("Ukupna zarada: ").append(ukupnaZarada()).append("\n");
        sb.append("Na odmoru: ").append(jeNaOdmoru()).append("\n");
        return sb.toString();
    }
}