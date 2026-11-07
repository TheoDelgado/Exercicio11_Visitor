package padroescomportamentais.visitor.cardapio;

public interface Visitor {

    String exibirPrato(Prato prato);
    String exibirBebida(Bebida bebida);
    String exibirSobremesa(Sobremesa sobremesa);

}