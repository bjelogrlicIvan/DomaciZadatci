package zadaca10;

class Fizikalac extends Radnik {
    public Fizikalac(String ime, double brojOdradjenihSati, double satnica) {
        super(ime, brojOdradjenihSati, satnica);
    }

    @Override
    public boolean jeNaOdmoru() {
        return getBrojOdradjenihSati() >= 40;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fizikalac: ").append(getIme()).append("\n");
        sb.append("Broj odradjenih sati: ").append(getBrojOdradjenihSati()).append("\n");
        sb.append("Satnica: ").append(getSatnica()).append("\n");
        sb.append("Ukupna zarada: ").append(ukupnaZarada()).append("\n");
        sb.append("Na odmoru: ").append(jeNaOdmoru()).append("\n");
        return sb.toString();
    }
}