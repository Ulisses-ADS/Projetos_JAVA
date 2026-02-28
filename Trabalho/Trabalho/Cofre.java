package Trabalho;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("ALL")
public class Cofre {
    public ArrayList<Moedas> moedas;

    public Cofre() {
        moedas = new ArrayList<>();
    }

    public void acrescentarMoedas(Moedas moeda) {
        moedas.add(moeda);
    }

    public boolean removerMoedas(double valor, String pais) {
        Iterator<Moedas> iterator = moedas.iterator();
        while (iterator.hasNext()) {
            Moedas moeda = iterator.next();
            if (moeda.getvalor() == valor && moeda.getpaís().equalsIgnoreCase(pais)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (Moedas moeda : moedas) {
            total += moeda.getvalor();
        }
        return total;
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofre esta vazio!");
            return;
        }

        for (int i = 0; i < moedas.size(); i++) {
            Moedas moeda = moedas.get(i);
            System.out.println(i + " - " + moeda.getvalor() + " (" + moeda.getpaís() + ")");
        }
    }

    public void adicionarMoeda(Moedas moeda) {
        moedas.add(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }

    public void removerMoedas(int indice) {
        if (indice >= 0 && indice < moedas.size()) {
            Moedas removida = moedas.remove(indice);
            System.out.println("Moeda removida: " + removida.getvalor() + " (" + removida.getpaís() + ")");
        } else {
            System.out.println("Indice invalido!");
        }
    }
}
