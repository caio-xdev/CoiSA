package lab2;

/**
 * Mantém o registro do tempo online dedicado a uma disciplina.
 *
 * @author Caio Benedito Cavalcanti Lopes
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoAdicionado;

    /**
     * Constrói um registro de tempo online com o tempo esperado de 120 horas.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
        this.tempoAdicionado = 0;
    }

    /**
     * Constrói um registro de tempo online definindo um tempo esperado e customizado.
     *
     * @param nomeDisciplina      o nome da disciplina
     * @param tempoOnlineEsperado o tempo esperado em horas
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoAdicionado = 0;
    }

    /**
     * Adiciona horas de tempo online dedicadas para a disciplina.
     *
     * @param tempo quantidade de horas a serem adicionadas
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoAdicionado += tempo;
    }

    /**
     * Verifica se o aluno atingiu ou superou a meta de tempo online esperada.
     *
     * @return true se atingiu ou ultrapassou a meta, false caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        return this.tempoAdicionado >= this.tempoOnlineEsperado;
    }

    /**
     * Retorna a representação em String do registro no formato "NomeDisciplina TempoUsado/TempoEsperado".
     *
     * @return representação textual do registro
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoAdicionado + "/" + this.tempoOnlineEsperado;
    }
}