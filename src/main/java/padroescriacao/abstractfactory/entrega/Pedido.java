package padroescriacao.abstractfactory.entrega;

public class Pedido {

    private Embalagem embalagem;
    private Etiqueta etiqueta;

    public Pedido(FabricaEntrega fabrica) {
        this.embalagem = fabrica.createEmbalagem();
        this.etiqueta = fabrica.createEtiqueta();
    }

    public String prepararEmbalagem() {
        return this.embalagem.preparar();
    }

    public String gerarEtiqueta() {
        return this.etiqueta.gerar();
    }
}