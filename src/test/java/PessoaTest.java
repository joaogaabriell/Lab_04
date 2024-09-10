package Laboratorio_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PessoaTest {

    private Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa("Carlos Silva");
    }

    @Test
    public void testAdicionarFuncao() {
        Funcao ator = new Ator("Protagonista");
        pessoa.adicionarFuncao(ator);
        List<Funcao> funcoes = pessoa.getFuncoes(); // Supondo que tenha o método getFuncoes() para testes

        assertEquals(1, funcoes.size());
        assertTrue(funcoes.contains(ator));
    }

    @Test
    public void testExibirFuncoes() {
        pessoa.adicionarFuncao(new Ator("Protagonista"));
        pessoa.adicionarFuncao(new Diretor());

        // Simulando exibição no console
        pessoa.exibirFuncoes(); // Este método não precisa ser testado com assertions, apenas como uma função de exibição.
    }

    @Test
    public void testGetNome() {
        assertEquals("Carlos Silva", pessoa.getNome());
    }
}
