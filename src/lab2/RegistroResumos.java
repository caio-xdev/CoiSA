package lab2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Controla vários resumos de estudos com capacidade limitada.
 *
 * @author Caio Benedito Cavalcanti Lopes
 */
public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int capacidade;
    private int proximo;
    private int totalCadastrados;

    /**
     * Constrói um registro de resumos com capacidade máxima definida.
     *
     * @param numeroDeResumos capacidade máxima de resumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.capacidade = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.proximo = 0;
        this.totalCadastrados = 0;
    }

    /**
     * Adiciona um resumo, controlando se o tema já existe, atualizando o conteúdo.
     * E se atingir a capacidade máxima, substitui os resumos de forma sequencial.
     *
     * @param tema     o tema do resumo
     * @param conteudo o conteúdo detalhado
     */
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

    /**
     * Retorna um array formatado com todos os resumos cadastrados.
     *
     * @return array de strings com os resumos formatados
     */
    public String[] pegaResumos() {
        String[] resumosFormatados = new String[this.totalCadastrados];
        for (int i = 0; i < this.totalCadastrados; i++) {
            resumosFormatados[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resumosFormatados;
    }

    /**
     * Retorna a quantidade atual de resumos armazenados.
     *
     * @return total de resumos cadastrados
     */
    public int conta() {
        return this.totalCadastrados;
    }

    /**
     * Retorna uma string imprimindo a quantidade e os temas, devidamente separados.
     *
     * @return representação resumida dos temas
     */
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

    /**
     * Verifica se existe um resumo cadastrado com o tema colocado.
     *
     * @param tema o tema a ser buscado
     * @return true se o tema existir, false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.totalCadastrados; i++) {
            if (this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Realiza uma busca nos conteúdos dos resumos por uma palavra-chave,
     * retornando os temas correspondentes em ordem alfabética.
     *
     * @param chaveDeBusca palavra ou texto a ser procurado
     * @return array de strings com os temas encontrados ordenados
     */
    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        ArrayList<String> temasEncontrados = new ArrayList<>();

        for (int i = 0; i < this.totalCadastrados; i++) {
            if (this.conteudos[i].toLowerCase().contains(chave)) {
                temasEncontrados.add(this.temas[i]);
            }
        }

        Collections.sort(temasEncontrados);
        return temasEncontrados.toArray(new String[0]);
    }
}