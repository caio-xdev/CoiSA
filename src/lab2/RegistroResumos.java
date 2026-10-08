package lab2;

public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int capacidade;
    private int proximo = 0;
    private int totalCadastrados = 0;

    public RegistroResumos(int numeroDeResumos) {
        this.capacidade = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < this.totalCadastrados; i++) {
            if (this.temas[i].equals(tema)) {
                this.conteudos[i] = conteudo;
                return;
            }
        }

        this.temas[this.proximo] = tema;
        this.conteudos[this.proximo] = conteudo;
        this.proximo = (this.proximo + 1) % this.capacidade;
        if (this.totalCadastrados < this.capacidade) {
            this.totalCadastrados++;
        }
    }

    public String[] pegaResumos() {
        String[] resumosFormatados = new String[this.totalCadastrados];
        for (int i = 0; i < this.totalCadastrados; i++) {
            resumosFormatados[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resumosFormatados;
    }

    public int conta() {
        return this.totalCadastrados;
    }

    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.totalCadastrados).append(" resumo(s) cadastrado(s)\n");
        for (int i = 0; i < this.totalCadastrados; i++) {
            sb.append(this.temas[i]);
            if (i < this.totalCadastrados - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }
    public String[] busca(String chaveDeBusca){
        return
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.totalCadastrados; i++) {
            if (this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}