public class CD {
    private String titulo;
    private int ano;
    private boolean ehDuplo;
    private Musica[] musicas;
    private Banda banda;

    public CD(String titulo, int duracao, int ano, boolean ehDuplo) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
    }

    // geti e seti papito
    public String getTitulo() { return titulo; }
    public void setNome(String titulo) {this.titulo = titulo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public boolean ehDuplo() { return ehDuplo; }
    public void setEhDuplo(boolean ehDuplo) {this.ehDuplo = ehDuplo; }
}
