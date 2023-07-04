package zadaca10;

class Radnik {
    private String ime;
    private double brojOdradjenihSati;
    private double satnica;

    public Radnik(String ime, double brojOdradjenihSati, double satnica) {
        this.ime = ime;
        this.brojOdradjenihSati = brojOdradjenihSati;
        this.satnica = satnica;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getBrojOdradjenihSati() {
        return brojOdradjenihSati;
    }

    public void setBrojOdradjenihSati(double brojOdradjenihSati) {
        this.brojOdradjenihSati = brojOdradjenihSati;
    }

    public double getSatnica() {
        return satnica;
    }

    public void setSatnica(double satnica) {
        this.satnica = satnica;
    }

    public double ukupnaZarada() {
        return brojOdradjenihSati * satnica;
    }

    public boolean jeNaOdmoru() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Radnik: ").append(ime).append("\n");
        sb.append("Broj odradjenih sati: ").append(brojOdradjenihSati).append("\n");
        sb.append("Satnica: ").append(satnica);
        return sb.toString();
    }
}
