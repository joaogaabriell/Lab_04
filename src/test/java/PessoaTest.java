package Laboratorio_04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    public void testAdicionarFuncao() {
        Pessoa pessoa = new Pessoa("Carlos Silva");
        Funcao ator = new Ator("Protagonista");
        pessoa.adicionarFuncao(ator);

        assertEquals(1, pessoa.getFuncoes().size());
        assertEquals("Ator: Protagonista", pessoa.getFuncoes().get(0).getDescricao());
    }

    @Test
    public void testExibirFuncoes() {
        Pessoa pessoa = new Pessoa("Carlos Silva");
        Funcao ator = new Ator("Protagonista");
        pessoa.adicionarFuncao(ator);

        pessoa.exibirFuncoes();
    }
}
