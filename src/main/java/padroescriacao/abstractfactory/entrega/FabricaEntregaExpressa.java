package padroescriacao.abstractfactory.entrega;

public class FabricaEntregaExpressa implements FabricaEntrega {

    @Override
    public Embalagem createEmbalagem() {
        return new EmbalagemExpressa();
    }

    @Override
    public Etiqueta createEtiqueta() {
        return new EtiquetaExpressa();
    }
}