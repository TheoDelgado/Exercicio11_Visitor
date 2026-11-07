package padroescriacao.abstractfactory.entrega;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void devePrepararEmbalagemPadrao() {
        FabricaEntrega fabrica = new FabricaEntregaPadrao();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Embalagem Padrão", pedido.prepararEmbalagem());
    }

    @Test
    void devePrepararEmbalagemExpressa() {
        FabricaEntrega fabrica = new FabricaEntregaExpressa();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Embalagem Expressa", pedido.prepararEmbalagem());
    }

    @Test
    void deveGerarEtiquetaPadrao() {
        FabricaEntrega fabrica = new FabricaEntregaPadrao();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Etiqueta de Entrega Padrão", pedido.gerarEtiqueta());
    }

    @Test
    void deveGerarEtiquetaExpressa() {
        FabricaEntrega fabrica = new FabricaEntregaExpressa();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Etiqueta de Entrega Expressa", pedido.gerarEtiqueta());
    }

}