package Laboratorio_04;

public class Ator implements Funcao {
    private final String papel;

    public Ator(String papel) {
        this.papel = papel;
    }

    @Override
    public String getDescricao() {
        return "Ator " + papel;
    }
}