import java.util.ArrayList;

public class Musico {

    private String nome;
    private String email;
    private ArrayList<Musica> musicas;
    private Banda banda;

    public Musico(String nome, String email, Banda banda) {
        this.nome = nome;
        this.email = email;
        this.musicas = new ArrayList<Musica>();
        this.banda = banda;
    }

    // geti e seti papito
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public ArrayList<Musica> getMusica() {return musicas; }
    public void setMusicas(ArrayList<Musica> musicas) { this.musicas = musicas; }
    public Banda getBanda() { return banda; }
    public void setBanda(Banda banda) {this.banda = banda; }
}
