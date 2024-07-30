import java.util.List;

public class Musico {

    private String nome;
    private String email;
    private List<Musica> musicas;

    public Musico(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // geti e seti papito
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
