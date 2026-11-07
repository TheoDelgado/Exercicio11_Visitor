package padroescomportamentais.visitor.cardapio;

public class ItemCardapioVisitor implements Visitor {

    public String exibir(ItemCardapio item) {
        return item.aceitar(this);
    }

    @Override
    public String exibirPrato(Prato prato) {
        return "Prato{" +
                "codigo=" + prato.getCodigo() +
                ", nome='" + prato.getNome() + '\'' +
                ", categoria=" + prato.getNomeCategoria() +
                '}';
    }

    @Override
    public String exibirBebida(Bebida bebida) {
        return "Bebida{" +
                "codigo=" + bebida.getCodigo() +
                ", nome='" + bebida.getNome() + '\'' +
                ", tamanho='" + bebida.getTamanho() + '\'' +
                '}';
    }

    @Override
    public String exibirSobremesa(Sobremesa sobremesa) {
        return "Sobremesa{" +
                "codigo=" + sobremesa.getCodigo() +
                ", nome='" + sobremesa.getNome() + '\'' +
                ", preco=" + sobremesa.getPreco() +
                '}';
    }
}