package desafio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaVarejoTest {

    VendaVarejo venda;

    @BeforeEach
    void setUp() {
        ConfiguracaoLoja.getInstance().setTaxaJurosCartao(0.05f);
        ConfiguracaoLoja.getInstance().setTaxaBoleto(3.5f);
        venda = new VendaVarejo();
        venda.setNumero(1);
        venda.setCliente("Ana");
        venda.setValorProdutos(200.0f);
    }

    @Test
    void deveCalcularTotalComPix() {
        venda.setFormaPagamento("Pix");
        assertEquals(190.0f, venda.calcularTotal(), 0.01f);
    }

    @Test
    void deveCalcularTotalComCartao() {
        venda.setFormaPagamento("Cartao");
        assertEquals(210.0f, venda.calcularTotal(), 0.01f);
    }

    @Test
    void deveCalcularTotalComBoleto() {
        venda.setFormaPagamento("Boleto");
        assertEquals(203.5f, venda.calcularTotal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        venda.setFormaPagamento("Boleto");
        assertEquals("Venda{numero=1, cliente='Ana', total=203.5}", venda.getInfo());
    }

    @Test
    void naoDeveCalcularTotalSemFormaDePagamento() {
        try {
            venda.calcularTotal();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Forma de pagamento não definida", e.getMessage());
        }
    }

    @Test
    void naoDeveDefinirFormaDePagamentoInexistente() {
        try {
            venda.setFormaPagamento("Dinheiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inexistente", e.getMessage());
        }
    }

}