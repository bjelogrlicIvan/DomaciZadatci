package zadaca11;

import java.util.ArrayList;

class SportskiKlub {
    private ArrayList<Sportista> clanovi;
    private String grad;
    private double budzet;

    public SportskiKlub(String grad, double budzet) {
        this.clanovi = new ArrayList<>();
        this.grad = grad;
        this.budzet = budzet;
    }

    public void dodajSportistu(Sportista sportista) {
        clanovi.add(sportista);
    }

    public double isplati() {
        double ukupnaPlata = 0;
        for (Sportista sportista : clanovi) {
            ukupnaPlata += sportista.getPlata();
        }
        double ostatak = budzet - ukupnaPlata;
        return ostatak;
    }

    public double prosecnoPlaceni() {
        if (clanovi.size() == 0) {
            return 0;
        }
        double ukupnaPlata = 0;
        for (Sportista sportista : clanovi) {
            ukupnaPlata += sportista.getPlata();
        }
        double prosecnaPlata = ukupnaPlata / clanovi.size();
        return prosecnaPlata;
    }

    public void removePreplaceni() {
        double prosecnaPlata = prosecnoPlaceni();
        ArrayList<Sportista> preplaceniSportisti = new ArrayList<>();
        for (Sportista sportista : clanovi) {
            if (sportista.getPlata() > prosecnaPlata) {
                preplaceniSportisti.add(sportista);
            }
        }
        clanovi.removeAll(preplaceniSportisti);
    }

    public ArrayList<Sportista> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Sportista> clanovi) {
        this.clanovi = clanovi;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Klub: ").append(this.getClass().getSimpleName()).append("\n");
        sb.append("Grad: ").append(grad).append("\n");
        sb.append("Budzet: ").append(budzet).append("\n");
        sb.append("Clanovi: ");
        for (Sportista sportista : clanovi) {
            sb.append("\n").append(sportista.toString());
        }
        return sb.toString();
    }
}