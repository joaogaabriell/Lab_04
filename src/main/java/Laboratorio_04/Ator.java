package Laboratorio_04;

public class Ator implements Funcao {
    private String nomePersonagem;

    public Ator(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    @Override
    public String getDescricao() {
        return "Ator - Personagem: " + nomePersonagem;
    }
}
