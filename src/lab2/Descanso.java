package lab2;

/**
 * Representa a rotina de descanso de um aluno, manipulando as horas de descanso
 * e o número de semanas para avaliar a situação geral. Para ser considerado
 * "descansado", o aluno DEVE ter 26 horas ou mais, sem considerar o sono, de descanso.
 *
 * @author Caio Benedito Cavalcanti Lopes
 */
public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    /**
     * Constrói o objeto Descanso começando com 0 horas e 1 semana como padrão.
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 1;
    }

    /**
     * Define a quantidade de horas de descanso acumuladas.
     *
     * @param valor quantidade de horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define o número de semanas válidas para o cálculo.
     *
     * @param valor número de semanas (deve ser maior que zero)
     */
    public void defineNumeroSemanas(int valor) {
        if (valor > 0) {
            this.numeroSemanas = valor;
        }
    }

    /**
     * Retorna o status geral do aluno com base na média de horas de descanso por semana.
     *
     * @return "descansado" se a média for >= 26 horas/semana, ou "cansado" caso for abaixo disso.
     */
    public String getStatusGeral() {
        if (this.numeroSemanas > 0 && (this.horasDescanso / this.numeroSemanas) >= 26) {
            return "descansado";
        }
        return "cansado";
    }
}