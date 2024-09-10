package Laboratorio_04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTest {

    @Test
    public void testAdicionarPessoaAoElenco() {
        Pessoa pessoaAtor = new Pessoa("Carlos Silva");
        Funcao ator = new Ator("Protagonista");
        pessoaAtor.adicionarFuncao(ator);

        Filme filme = new Filme("Aventura na Selva", 2023, new Pessoa("Diretor"), new Pessoa("Roteirista"), "Trilha Sonora 1");
        filme.adicionarPessoaAoElenco(pessoaAtor);

    }

    @Test
    public void testExibirDetalhes() {
        Pessoa pessoaAtor = new Pessoa("Carlos Silva");
        Funcao ator = new Ator("Protagonista");
        pessoaAtor.adicionarFuncao(ator);

        Pessoa pessoaDiretor = new Pessoa("João Mendes");
        Funcao diretor = new Diretor();
        pessoaDiretor.adicionarFuncao(diretor);

        Pessoa pessoaRoteirista = new Pessoa("Ana Lima");
        Funcao roteirista = new Roteirista();
        pessoaRoteirista.adicionarFuncao(roteirista);

        Filme filme = new Filme("Aventura na Selva", 2023, pessoaDiretor, pessoaRoteirista, "Trilha Sonora 1");
        filme.adicionarPessoaAoElenco(pessoaAtor);


        filme.exibirDetalhes();
    }
}
