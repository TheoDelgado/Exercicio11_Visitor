package desafio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteObserverTest {

    @Test
    void deveNotificarClienteQuandoPedidoForPago() {
        Pedido pedido = new Pedido("1001");
        ClienteObserver cliente = new ClienteObserver("Theo");
        cliente.inscrever(pedido);

        pedido.pagar();

        assertEquals("Theo, seu pedido 1001 agora está Pago", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteACadaMudancaDeEstado() {
        Pedido pedido = new Pedido("1002");
        ClienteObserver cliente = new ClienteObserver("Theo");
        cliente.inscrever(pedido);

        pedido.pagar();
        pedido.enviar();

        assertEquals("Theo, seu pedido 1002 agora está Enviado", cliente.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarClienteNaoInscrito() {
        Pedido pedido = new Pedido("1003");
        ClienteObserver cliente = new ClienteObserver("Theo");

        pedido.pagar();

        assertEquals(null, cliente.getUltimaNotificacao());
    }

}