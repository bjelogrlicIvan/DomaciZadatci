package zadaca7;

import java.util.ArrayList;
import java.util.List;

public class Zadatak1 {
    public static List<Integer> kreirajListuParnihBrojeva() {
        List<Integer> lista = new ArrayList<>();

        for (int i = 1; lista.size() < 20; i++) {
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        return lista;
    }

    public static List<Integer> eliminisiDeljiveSa4(List<Integer> lista) {
        List<Integer> novaLista = new ArrayList<>();

        for (int broj : lista) {
            if (broj % 4 != 0) {
                novaLista.add(broj);
            }
        }
        return novaLista;
    }

    public static void main(String[] args) {
        List<Integer> lista1 = kreirajListuParnihBrojeva();
        System.out.println("Lista parnih brojeva: " + lista1);

        List<Integer> lista2 = eliminisiDeljiveSa4(lista1);
        System.out.println("Lista parnih brojeva koji nisu deljivi sa 4: " + lista2);
    }
}
