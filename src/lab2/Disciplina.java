package lab2;

import java.util.Arrays;

public class Disciplina {
    // Sugiro comentar as partes esseciais, como "Atributos" aqui!
    private String nomeDisciplina;
    private int horasEstudo = 0;
    private double[] notas = new double[4];
    // Construtor
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    // Métodos
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= 4) {
            this.notas[nota - 1] = valorNota;
        }
    }

    private double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / 4;
    }

    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}