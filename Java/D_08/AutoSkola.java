package zadaca8;

public class AutoSkola {

    private String naziv;
    private int brojLjudi;
    private double cenaPolaganja;
    private String tipVozila;

    public AutoSkola(String naziv, int brojLjudi, double cenaPolaganja, String tipVozila) {
        this.naziv = naziv;
        this.brojLjudi = brojLjudi;
        this.cenaPolaganja = cenaPolaganja;
        this.tipVozila = tipVozila;
    }

    public void popustZaMotor() {
        if (tipVozila.equalsIgnoreCase("motor")) {
            cenaPolaganja *= 0.5;
        }
    }

    public int brojGrupa() {
        int brojGrupa = brojLjudi / 5;
        return brojGrupa;
    }

    public void proveraMogucnostiPolaganja() {
        if (tipVozila.equalsIgnoreCase("autobus")) {
            System.out.println("Polaganje za autobus nije moguće u ovom trenutku.");
        } else {
            System.out.println("Polaganje je moguće.");
        }
    }

    @Override
    public String toString() {
        return "Auto-skola: " + naziv +
                "\nBroj ljudi: " + brojLjudi +
                "\nCena polaganja: " + cenaPolaganja +
                "\nTip vozila: " + tipVozila +
                "\nBroj grupa: " + brojGrupa();
    }

    public static void main(String[] args) {
        AutoSkola autoSkola = new AutoSkola("AutoMoto", 10, 2000, "Autobus");
        autoSkola.popustZaMotor();
        autoSkola.brojGrupa();
        autoSkola.proveraMogucnostiPolaganja();

        System.out.println(autoSkola.toString());
    }
}
