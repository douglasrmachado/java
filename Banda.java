import java.util.List;

public class Banda {
    private String nome;
    private EstiloEnum estilo;
    private List<Musico> musicos;
    private CD[] cds;

    public Banda(String nome, EstiloEnum estilo, List<Musico> musicos) {
        this.nome = nome;
        this.estilo = estilo;
        this.musicos = musicos;
    }

    // geti e seti papito
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public EstiloEnum getEstilo() { return estilo; }
    public void setEstilo(EstiloEnum estilo) { this.estilo = estilo; }
    public List<Musico> getMusicos() { return musicos; }
    public void setMusicos(List<Musico> musicos) { this.musicos = musicos; }
}