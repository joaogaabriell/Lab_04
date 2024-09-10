package Laboratorio_04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtorTest {

    @Test
    public void testGetDescricao() {
        Funcao ator = new Ator("Protagonista");
        assertEquals("Ator: Protagonista", ator.getDescricao());
    }
}
