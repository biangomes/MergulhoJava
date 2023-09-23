package app;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal2 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Beatriz", "12332145665");
        Pessoa pessoa2 = new Pessoa("Maria das Couves", "22233344456");
        Pessoa pessoa3 = new Pessoa("José João", "34554232100");
        Pessoa pessoa4 = new Pessoa("José João", "34554232100");
        Pessoa pessoa5 = new Pessoa("Abelardo das Flores", "02105460186");

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);


        // metodo contains percorre toda a lista e verifica para qual objeto, se é igual ou não
        // a verificação é pelo conteúdo
        boolean existePessoaNaLista = pessoas.contains(pessoa5);
        System.out.println("Existe pessoa na lista? R.: " + existePessoaNaLista);
    }
}
