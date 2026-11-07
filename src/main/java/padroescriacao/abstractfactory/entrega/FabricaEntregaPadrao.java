package padroescriacao.abstractfactory.entrega;

public class FabricaEntregaPadrao implements FabricaEntrega {

    @Override
    public Embalagem createEmbalagem() {
        return new EmbalagemPadrao();
    }

    @Override
    public Etiqueta createEtiqueta() {
        return new EtiquetaPadrao();
    }
}