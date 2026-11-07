package desafio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueObserverTest {

    @Test
    void deveNotificarEstoqueQuandoPedidoForCancelado() {
        Pedido pedido = new Pedido("1001");
        EstoqueObserver estoque = new EstoqueObserver();
        estoque.inscrever(pedido);

        pedido.cancelar();

        assertEquals("Estoque notificado: pedido 1001 mudou para Cancelado", estoque.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteEEstoqueAoMesmoTempo() {
        Pedido pedido = new Pedido("1004");
        ClienteObserver cliente = new ClienteObserver("Theo");
        EstoqueObserver estoque = new EstoqueObserver();
        cliente.inscrever(pedido);
        estoque.inscrever(pedido);

        pedido.pagar();

        assertEquals("Theo, seu pedido 1004 agora está Pago", cliente.getUltimaNotificacao());
        assertEquals("Estoque notificado: pedido 1004 mudou para Pago", estoque.getUltimaNotificacao());
    }

}