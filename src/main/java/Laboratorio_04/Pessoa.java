package Laboratorio_04;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private final String nome;
    private final List<Funcao> funcoes;
    private final List<Filme> filmografia;

    public Pessoa(String nome) {
        this.nome = nome;
        this.funcoes = new ArrayList<>();
        this.filmografia = new ArrayList<>();
    }

    public void adicionarFuncao(Funcao funcao) {
        funcoes.add(funcao);
    }

    public void adicionarFilme(Filme filme) {
        filmografia.add(filme);
    }

    public void exibirFuncoes() {
        System.out.println("Nome: " + nome);
        for (Funcao funcao : funcoes) {
            System.out.println(funcao.getDescricao());
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }

    public void exibirFilmografia() {
        System.out.println("Filmografia de " + nome + ":");
        for (Filme filme : filmografia) {
            System.out.println("- " + filme.getTitulo() + " (" + filme.getAno() + ")");
            for (Funcao funcao : funcoes) {
                System.out.println("  Funcao: " + funcao.getDescricao());
            }
        }
    }
}