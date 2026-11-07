package desafio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido("1001");
    }

    @Test
    public void devePagarPedidoNovo() {
        assertTrue(pedido.pagar());
        assertEquals(PedidoEstadoPago.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEnviarPedidoNovo() {
        assertFalse(pedido.enviar());
    }

    @Test
    public void deveEnviarPedidoPago() {
        pedido.pagar();
        assertTrue(pedido.enviar());
        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEntregarPedidoEnviado() {
        pedido.pagar();
        pedido.enviar();
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveCancelarPedidoEnviado() {
        pedido.pagar();
        pedido.enviar();
        assertFalse(pedido.cancelar());
    }

}