import java.util.ArrayList;

public class Banda {
    private String nome;
    private EstiloEnum estilo;
    private ArrayList<Musico> musicos;
    private ArrayList<CD> cds;

    public Banda(String nome, EstiloEnum estilo) {
        this.nome = nome;
        this.estilo = estilo;
        this.musicos = new ArrayList<Musico>();
    }

    // geti e seti papito
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public EstiloEnum getEstilo() { return estilo; }
    public void setEstilo(EstiloEnum estilo) { this.estilo = estilo; }
    public ArrayList<Musico> getMusicos() { return musicos; }
    public void setMusicos(ArrayList<Musico> musicos) { this.musicos = musicos; }
    public ArrayList<CD> getCds() {return cds; }
    public void setCds(ArrayList<CD> cds) {this.cds = cds; }
}