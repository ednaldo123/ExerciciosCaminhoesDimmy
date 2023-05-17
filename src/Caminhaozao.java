import java.util.ArrayList;
import java.util.List;

class Caminhaozao {
    private String placa;
    private List<Cargona> listaEntregas;

    public Caminhaozao(String placa) {
        this.placa = placa;
        this.listaEntregas = new ArrayList<>();
    }

    public void adicionarCargona(Cargona carga) {
        listaEntregas.add(carga);
    }

    public Cargona removerCargona() {
        if (listaEntregas.isEmpty()) {
            return null;
        }
        return listaEntregas.remove(listaEntregas.size() - 1);
    }

    public boolean PendenciaEntregas() {
        return !listaEntregas.isEmpty();
    }

    @Override
    public String toString() {
        return "Caminhão - Placa: " + placa;
    }
}
