package Laboratorio_04;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Funcao> funcoes;

    public Pessoa(String nome) {
        this.nome = nome;
        this.funcoes = new ArrayList<>();
    }

    public void adicionarFuncao(Funcao funcao) {
        funcoes.add(funcao);
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
}
