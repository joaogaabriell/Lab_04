package Laboratorio_04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncoesTest {

    @Test
    public void testAtorDescricao() {
        Funcao ator = new Ator("Protagonista");
        assertEquals("Ator - Personagem: Protagonista", ator.getDescricao());
    }

    @Test
    public void testDiretorDescricao() {
        Funcao diretor = new Diretor();
        assertEquals("Diretor", diretor.getDescricao());
    }

    @Test
    public void testRoteiristaDescricao() {
        Funcao roteirista = new Roteirista();
        assertEquals("Roteirista", roteirista.getDescricao());
    }

    @Test
    public void testCinegrafistaDescricao() {
        Funcao cinegrafista = new Cinegrafista();
        assertEquals("Cinegrafista", cinegrafista.getDescricao());
    }
}
