package lab2;

import java.util.Arrays;

/**
 * Controla as informações de uma disciplina, como as horas de estudo e notas.
 *
 * @author Caio Benedito Cavalcanti Lopes
 */
public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    /**
     * Constrói uma disciplina com 4 notas por padrão.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
    }

    /**
     * Adiciona horas de estudo acumuladas na disciplina.
     *
     * @param horas quantidade de horas estudadas
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra / substitui uma nota da disciplina.
     *
     * @param nota      número da nota (1 a 4)
     * @param valorNota valor da nota obtida
     */
    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= this.notas.length) {
            this.notas[nota - 1] = valorNota;
        }
    }

    /**
     * Calcula a média aritmética das notas da disciplina.
     *
     * @return a média calculada
     */
    private double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    /**
     * Verifica se o aluno foi aprovado com a média maior ou igual a 7.0.
     *
     * @return true se aprovado, false caso contrário
     */
    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    /**
     * Retorna a representação em String da disciplina.
     *
     * @return string contendo nome, horas, média e array de notas
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}