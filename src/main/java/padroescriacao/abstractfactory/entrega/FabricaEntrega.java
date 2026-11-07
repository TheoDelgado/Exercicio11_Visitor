package padroescriacao.abstractfactory.entrega;

public interface FabricaEntrega {
    Embalagem createEmbalagem();
    Etiqueta createEtiqueta();
}