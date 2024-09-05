package Laboratorio_04;

public class Main {
    public static void main(String[] args) {
        // Criando pessoas
        Pessoa ator1 = new Pessoa("Carlos Silva");
        ator1.adicionarFuncao(new Ator("Protagonista"));

        Pessoa ator2 = new Pessoa("Maria Souza");
        ator2.adicionarFuncao(new Ator("Antagonista"));

        Pessoa diretor = new Pessoa("João Mendes");
        diretor.adicionarFuncao(new Diretor());

        Pessoa roteirista = new Pessoa("Ana Lima");
        roteirista.adicionarFuncao(new Roteirista());

        // Criando filme
        Filme filme = new Filme("Aventura na Selva", 2023, diretor, roteirista, "Trilha Sonora 1");
        filme.adicionarPessoaAoElenco(ator1);
        filme.adicionarPessoaAoElenco(ator2);

        // Exibindo detalhes do filme
        filme.exibirDetalhes();
    }
}
