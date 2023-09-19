package app;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Beatriz", "12332145665");
        Pessoa pessoa2 = new Pessoa("Maria das Couves", "22233344456");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        for (int i = 0; i<pessoas.size(); i++) {
            System.out.println(pessoas.get(i).getNome());
            System.out.println(pessoas.get(i).getTipo());
        }
    }
}
