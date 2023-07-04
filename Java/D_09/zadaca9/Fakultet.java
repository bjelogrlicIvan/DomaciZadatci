package zadaca9;

import java.util.ArrayList;
import java.util.List;

public class Fakultet {
    private String naziv;
    private List<Departman> listaDepartmana;

    public Fakultet(String naziv) {
        this.naziv = naziv;
        this.listaDepartmana = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(List<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }
    public void dodajDepartman(Departman departman){
        listaDepartmana.add(departman);
    }
    public int ukupanBrojUcenika(){
        int ukupanBrojUcenika = 0;
        for (Departman departman: listaDepartmana
             ) {
            ukupanBrojUcenika += departman.getBrojStudenata();
        }
        return ukupanBrojUcenika;
    }
    public void dodavanjePredmeta(){
        for (Departman departman: listaDepartmana
             ) {
            if(departman.getNazivDepartmana().equalsIgnoreCase("biologija") || departman.getNazivDepartmana().equalsIgnoreCase("matematika")){
                departman.setBrojStrucnihPredmeta(departman.getBrojStrucnihPredmeta() + 5);
            }
        }
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Fakultet: ").append(naziv).append("\n");
        for (Departman departman: listaDepartmana
             ) {
            sb.append(departman.toString()).append("\n");
        }
        return sb.toString();
    }
}
