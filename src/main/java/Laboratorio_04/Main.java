package Laboratorio_04;

public class Main {
    public static void main(String[] args) {
        // Criando funções
        Funcao ator1 = new Ator("Protagonista");
        Funcao ator2 = new Ator("Antagonista");
        Funcao diretor = new Diretor();
        Funcao roteirista = new Roteirista();
        Funcao cinegrafista = new Cinegrafista();

        // Criando pessoas
        Pessoa pessoaAtor1 = new Pessoa("Carlos Silva");
        pessoaAtor1.adicionarFuncao(ator1);

        Pessoa pessoaAtor2 = new Pessoa("Maria Souza");
        pessoaAtor2.adicionarFuncao(ator2);

        Pessoa pessoaDiretor = new Pessoa("João Mendes");
        pessoaDiretor.adicionarFuncao(diretor);

        Pessoa pessoaRoteirista = new Pessoa("Ana Lima");
        pessoaRoteirista.adicionarFuncao(roteirista);

        Pessoa pessoaCinegrafista = new Pessoa("Pedro Almeida");
        pessoaCinegrafista.adicionarFuncao(cinegrafista);

        // Criando filme
        Filme filme = new Filme("Aventura na Selva", 2023, pessoaDiretor, pessoaRoteirista, "Trilha Sonora 1");
        filme.adicionarPessoaAoElenco(pessoaAtor1);
        filme.adicionarPessoaAoElenco(pessoaAtor2);
        filme.adicionarPessoaAoElenco(pessoaCinegrafista);

        // Exibindo detalhes do filme
        filme.exibirDetalhes();
    }
}
