package zadaca9;

public class Departman {
    private String nazivDepartmana;
    private int brojStudenata;
    private int brojStrucnihPredmeta;

    public Departman(String nazivDepartmana, int brojStudenata, int brojStrucnihPredmeta) {
        this.nazivDepartmana = nazivDepartmana;
        this.brojStudenata = brojStudenata;
        this.brojStrucnihPredmeta = brojStrucnihPredmeta;
    }

    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        if (brojStudenata >= 0) {
            this.brojStudenata = brojStudenata;
        } else {
            System.out.println("Greska: Broj studenata ne moze biti negativan!");
            this.brojStudenata = 0;
        }
    }

    public int getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    public void setBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if (brojStrucnihPredmeta >= 0) {
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
        } else {
            System.out.println("Greska: Broj strucnih predmeta ne moze biti negativan!");
            this.brojStrucnihPredmeta = 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departman: ").append(nazivDepartmana)
                .append(", Broj studenata: ").append(brojStudenata)
                .append(", Broj strucnih predmeta:").append(brojStrucnihPredmeta);
        return sb.toString();
    }
}
