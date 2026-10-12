package lab2;

/**
 * Representa um resumo de estudos contendo um tema e seu respectivo conteúdo.
 *
 * @author Caio Benedito Cavalcanti Lopes
 */
public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * Constrói um resumo a partir de um tema e seu conteúdo.
     *
     * @param tema     o tema do resumo
     * @param conteudo o conteúdo detalhado do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return o tema
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Retorna o conteúdo detalhado do resumo.
     *
     * @return o conteúdo
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Retorna a representação em String do resumo no formato "Tema: Conteúdo".
     *
     * @return a representação textual do resumo
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}