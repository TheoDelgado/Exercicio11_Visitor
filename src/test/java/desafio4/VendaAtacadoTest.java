package desafio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaAtacadoTest {

    VendaAtacado venda;

    @BeforeEach
    void setUp() {
        ConfiguracaoLoja.getInstance().setTaxaJurosCartao(0.05f);
        ConfiguracaoLoja.getInstance().setTaxaBoleto(3.5f);
        venda = new VendaAtacado();
        venda.setNumero(2);
        venda.setCliente("Empresa X");
        venda.setValorProdutos(200.0f);
    }

    @Test
    void deveCalcularTotalComPix() {
        venda.setFormaPagamento("Pix");
        assertEquals(171.0f, venda.calcularTotal(), 0.01f);
    }

    @Test
    void deveCalcularTotalComCartao() {
        venda.setFormaPagamento("Cartao");
        assertEquals(189.0f, venda.calcularTotal(), 0.01f);
    }

    @Test
    void deveCalcularTotalComBoleto() {
        venda.setFormaPagamento("Boleto");
        assertEquals(183.5f, venda.calcularTotal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        venda.setFormaPagamento("Boleto");
        assertEquals("VendaAtacado{numero=2, cliente='Empresa X', total=183.5}", venda.getInfo());
    }

}