public class Medicamento {
    private String nome;
    private String fabricante;
    private String categoria;

    public Medicamento(String nome, String fabricante, String categoria) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoria = categoria;
    }

    public String getNome() { return nome; }
    public String getFabricante() { return fabricante; }
    public String getCategoria() { return categoria; }

    public void setNome(String nome) { this.nome = nome; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}
