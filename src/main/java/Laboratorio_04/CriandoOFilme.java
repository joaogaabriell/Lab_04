package Laboratorio_04;

public class CriandoOFilme {
    public static void main(String[] args) {
        // Criando pessoas
        Pessoa ator1 = new Pessoa("Carlos Silva");
        Pessoa ator2 = new Pessoa("Maria Souza");
        Pessoa diretor = new Pessoa("João Mendes");
        Pessoa cinegrafista = new Pessoa("Lucas Oliveira");
        Pessoa roteirista1 = new Pessoa("Ana Lima");
        Pessoa roteirista2 = new Pessoa("Pedro Gonçalves");

        // Criando filme 1
        Filme filme1 = new Filme("Aventura na Selva", 2023, diretor, roteirista1, "Trilha Sonora 1");
//        ator1.adicionarFuncao(new Ator("Protagonista"), filme1);
//        ator2.adicionarFuncao(new Ator("Antagonista"), filme1);
//        diretor.adicionarFuncao(new Diretor(), filme1);
//        cinegrafista.adicionarFuncao(new Cinegrafista(), filme1);
        filme1.adicionarPessoaAoElenco(ator1);
        filme1.adicionarPessoaAoElenco(cinegrafista);

        // Criando filme 2
        Filme filme2 = new Filme("Missão no Deserto", 2022, diretor, roteirista2, "Trilha Sonora 2");
//        ator1.adicionarFuncao(new Ator("Co-protagonista"), filme2);
//        diretor.adicionarFuncao(new Diretor(), filme2);
//        cinegrafista.adicionarFuncao(new Cinegrafista(), filme2);
        filme2.adicionarPessoaAoElenco(ator1);

        // Exibindo detalhes dos filmes
        filme1.exibirDetalhes();
        filme2.exibirDetalhes();

        // Exibindo a filmografia de uma pessoa
        ator1.exibirFilmografia();
        diretor.exibirFilmografia();
    }
}
