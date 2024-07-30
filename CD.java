import java.util.ArrayList;

public class CD {
    private String titulo;
    private int ano;
    private boolean ehDuplo;
    private ArrayList<Musica> musicas;
    private Banda banda;

    public CD(String titulo, int duracao, int ano, boolean ehDuplo, Banda banda) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
        this.banda = banda;
        this.musicas = new ArrayList<Musica>();
    }

    // geti e seti papito
    public String getTitulo() { return titulo; }
    public void setNome(String titulo) {this.titulo = titulo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public boolean ehDuplo() { return ehDuplo; }
    public void setEhDuplo(boolean ehDuplo) {this.ehDuplo = ehDuplo; }
    public ArrayList<Musica> getMusicas() { return musicas; }
    public void setMusicas(ArrayList<Musica> musicas) { this.musicas = musicas; }
    public Banda getBanda() { return banda; }
    public void setBanda(Banda banda) { this.banda = banda; }
}
