import java.util.Stack;

class Cargona {
    private String descricao;
    private int nivelCriticidade;

    public Cargona(String descricao, int nivelCriticidade) {
        this.descricao = descricao;
        this.nivelCriticidade = nivelCriticidade;
    }

    public int getNivelCriticidade() {
        return nivelCriticidade;
    }

    @Override
    public String toString() {
        return descricao;
    }
}





