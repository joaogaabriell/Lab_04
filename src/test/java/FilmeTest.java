package Laboratorio_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilmeTest {

    private Filme filme;
    private Pessoa diretor;
    private Pessoa roteirista;

    @BeforeEach
    public void setUp() {
        diretor = new Pessoa("João Mendes");
        diretor.adicionarFuncao(new Diretor());

        roteirista = new Pessoa("Ana Lima");
        roteirista.adicionarFuncao(new Roteirista());

        filme = new Filme("Aventura na Selva", 2023, diretor, roteirista, "Trilha Sonora 1");
    }

    @Test
    public void testAdicionarPessoaAoElenco() {
        Pessoa ator = new Pessoa("Carlos Silva");
        ator.adicionarFuncao(new Ator("Protagonista"));

        filme.adicionarPessoaAoElenco(ator);

        // Verifique se a pessoa foi adicionada corretamente ao elenco
        assertTrue(filme.getElenco().contains(ator));
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Aventura na Selva", filme.getTitulo());
    }

    @Test
    public void testGetAno() {
        assertEquals(2023, filme.getAno());
    }

    @Test
    public void testGetDiretor() {
        assertEquals("João Mendes", filme.getDiretor().getNome());
    }

    @Test
    public void testGetRoteirista() {
        assertEquals("Ana Lima", filme.getRoteirista().getNome());
    }
}
