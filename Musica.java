import java.util.List;

public class Musica {

    private String titulo;
    private int duracao;
    private List<Musico> musicos;

    public Musica(String titulo, int duracao, List<Musico> musicos) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.musicos = musicos;
    }

    // geti e seti papito
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }
    public List<Musico> getMusicos() { return musicos; }
    public void setMusicos(List<Musico> musicos) { this.musicos = musicos; }
    
}