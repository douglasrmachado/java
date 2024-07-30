import java.util.ArrayList;

public class Musica {

    private String titulo;
    private int duracao;
    private ArrayList<Musico> musicos;
    private CD cd;

    public Musica(String titulo, int duracao, CD cd) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.musicos = new ArrayList<Musico>();
        this.cd = cd;
    }

    // geti e seti papito
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }
    public ArrayList<Musico> getMusicos() { return musicos; }
    public void setMusicos(ArrayList<Musico> musicos) { this.musicos = musicos; }
    public CD getCd() {return cd;}
    public void setCd(CD cd) {this.cd = cd;}
}