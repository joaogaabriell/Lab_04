package Laboratorio_04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilmeTest {

    @Test
    public void testCriacaoFilme() {
        Filme filme = new Filme("Aventura na Selva", 2023, new Pessoa("Diretor"), new Pessoa("Roteirista"), "Trilha Sonora 1");

        assertEquals("Aventura na Selva", filme.getTitulo());
        assertEquals(2023, filme.getAno());
        assertTrue(filme.getElenco().isEmpty());
    }

    @Test
    public void testAdicionarPessoaAoElenco() {
        Pessoa pessoaAtor = new Pessoa("Carlos Silva");
        pessoaAtor.adicionarFuncao(new Ator("Protagonista"));

        Filme filme = new Filme("Aventura na Selva", 2023, new Pessoa("Diretor"), new Pessoa("Roteirista"), "Trilha Sonora 1");
        filme.adicionarPessoaAoElenco(pessoaAtor);

        assertEquals(1, filme.getElenco().size());
        assertTrue(filme.getElenco().contains(pessoaAtor));
    }

    @Test
    public void testExibirDetalhes() {
        Pessoa pessoaAtor = new Pessoa("Carlos Silva");
        pessoaAtor.adicionarFuncao(new Ator("Protagonista"));

        Pessoa pessoaDiretor = new Pessoa("João Mendes");
        pessoaDiretor.adicionarFuncao(new Diretor());

        Pessoa pessoaRoteirista = new Pessoa("Ana Lima");
        pessoaRoteirista.adicionarFuncao(new Roteirista());

        Filme filme = new Filme("Aventura na Selva", 2023, pessoaDiretor, pessoaRoteirista, "Trilha Sonora 1");
        filme.adicionarPessoaAoElenco(pessoaAtor);

        assertDoesNotThrow(filme::exibirDetalhes);
    }
}
