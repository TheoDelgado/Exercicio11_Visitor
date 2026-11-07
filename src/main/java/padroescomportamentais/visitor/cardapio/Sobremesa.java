package padroescomportamentais.visitor.cardapio;

public class Sobremesa implements ItemCardapio {

    private int codigo;
    private String nome;
    private float preco;

    public Sobremesa(int codigo, String nome, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSobremesa(this);
    }

}