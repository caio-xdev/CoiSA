public class Tempo {
    private int tempo;
    private int horas;
    private String nomeDisciplina;

    public Tempo(int tempo, String nomeDisciplina) {
        this.tempo = tempo;
        this.nomeDisciplina = nomeDisciplina;
    }

    public void adicionaTempoOnline(int tempo) {
        horas += tempo;
    }
}
