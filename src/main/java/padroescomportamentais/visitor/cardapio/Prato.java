package padroescomportamentais.visitor.cardapio;

public class Prato implements ItemCardapio {

    private int codigo;
    private String nome;
    private Categoria categoria;

    public Prato(int codigo, String nome, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCategoria() {
        return this.categoria.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPrato(this);
    }

}