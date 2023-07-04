package zadaca13;

import java.util.ArrayList;
import java.util.List;

public class Planinar implements Planinarenje {
    private List<Planina> planine;
    private int maksimalanUspon;
    private double tezinaOpreme;

    public Planinar(int maksimalanUspon, double tezinaOpreme) {
        this.planine = new ArrayList<>();
        this.maksimalanUspon = maksimalanUspon;
        this.tezinaOpreme = tezinaOpreme;
    }

    public List<Planina> getPlanine() {
        return planine;
    }

    public void setPlanine(List<Planina> planine) {
        this.planine = planine;
    }

    public int getMaksimalanUspon() {
        return maksimalanUspon;
    }

    public void setMaksimalanUspon(int maksimalanUspon) {
        this.maksimalanUspon = maksimalanUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public void popniSe(Planina planina) {
        if (planina.getVisina() <= maksimalanUspon) {
            planine.add(planina);
        }
    }

    @Override
    public double clanarina() {
        double popust = planine.size() * 0.02;
        return 1000 - (1000 * popust);
    }

    @Override
    public int sviUsponi() {
        int ukupnaVisina = 0;
        for (Planina planina : planine) {
            ukupnaVisina += planina.getVisina();
        }
        return ukupnaVisina;
    }

    @Override
    public Planina najvecaPlanina() {
        Planina najvecaPlanina = null;
        for (Planina planina : planine) {
            if (najvecaPlanina == null || planina.getVisina() > najvecaPlanina.getVisina()) {
                najvecaPlanina = planina;
            }
        }
        return najvecaPlanina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planine na koje se planinar popeo:\n");
        for (Planina planina : planine) {
            sb.append(planina).append("\n");
        }
        return sb.toString() +
                "Maksimalan uspon: " + maksimalanUspon +
                "\nTezina opreme: " + tezinaOpreme +
                "\nClanarina: " + clanarina() +
                "\nSvi usponi: " + sviUsponi() +
                "\nNajveca planina: " + (najvecaPlanina() != null ? najvecaPlanina().getNaziv() : "Nema planina") +
                "\n";
    }
}

