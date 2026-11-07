package padroescomportamentais.strategy.frete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteEconomico() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteEconomico(10.0f, 100.0f);
        assertEquals(20.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteExpresso() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteExpresso(10.0f, 100.0f);
        assertEquals(65.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteRetirada() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteRetirada(10.0f, 100.0f);
        assertEquals(0.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteLocal() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteLocal(10.0f, 30.0f);
        assertEquals(10.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void naoDeveCalcularFreteLocalAcimaDoLimite() {
        try {
            Pedido pedido = new Pedido();
            pedido.calcularFreteLocal(10.0f, 80.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância acima do limite para entrega local", e.getMessage());
        }
    }

}