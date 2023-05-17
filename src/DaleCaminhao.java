public class DaleCaminhao {
    public static void main(String[] args) {
        // AQUI VAMOS CRIAR OS CAMINHOES
        Caminhaozao caminhaozao1 = new Caminhaozao("XANA157");
        Caminhaozao caminhaozao2 = new Caminhaozao("RAG453");
        Caminhaozao caminhaozao3 = new Caminhaozao("QWE777");

        // AQUI IREMOS ADICIONAR AS CARGAS
        caminhaozao1.adicionarCargona(new Cargona("TRANQUEIRA 1", 3));
        caminhaozao1.adicionarCargona(new Cargona("TRANQUEIRA 2", 1));
        caminhaozao2.adicionarCargona(new Cargona("TRANQUEIRA 3", 2));
        caminhaozao3.adicionarCargona(new Cargona("TRANQUEIRA 4", 1));
        caminhaozao3.adicionarCargona(new Cargona("TRANQUEIRA 5", 2));

        // REALIZAR ENTREGAS DEPENDENDO DA PRIORIDADE
        while (caminhaozao1.PendenciaEntregas() || caminhaozao2.PendenciaEntregas() || caminhaozao3.PendenciaEntregas()) {
            Caminhaozao caminhaoPrioritario = obterCaminhaoPrioritario(caminhaozao1, caminhaozao2, caminhaozao3);

            if (caminhaoPrioritario != null) {
                Cargona carga = caminhaoPrioritario.removerCargona();
                System.out.println("Tranqueira entregue pelo " + caminhaoPrioritario.toString() + ": " + carga.toString());
            }
        }
    }

    public static Caminhaozao obterCaminhaoPrioritario(Caminhaozao... caminhoes) {
        Caminhaozao caminhaoPrioritario = null;

        for (Caminhaozao caminhao : caminhoes) {
            if (caminhao.PendenciaEntregas()) {
                if (caminhaoPrioritario == null || caminhao.removerCargona().getNivelCriticidade() < caminhaoPrioritario.removerCargona().getNivelCriticidade()) {
                    caminhaoPrioritario = caminhao;
                }
            }
        }
        return caminhaoPrioritario;
    }
}