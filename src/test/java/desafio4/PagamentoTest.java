package desafio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @BeforeEach
    void setUp() {
        ConfiguracaoLoja.getInstance().setTaxaJurosCartao(0.05f);
        ConfiguracaoLoja.getInstance().setTaxaBoleto(3.5f);
    }

    @Test
    void deveCalcularPagamentoPix() {
        EstrategiaPagamento pagamento = new PagamentoPix();
        assertEquals(190.0f, pagamento.calcular(200.0f), 0.01f);
    }

    @Test
    void deveCalcularPagamentoCartao() {
        EstrategiaPagamento pagamento = new PagamentoCartao();
        assertEquals(210.0f, pagamento.calcular(200.0f), 0.01f);
    }

    @Test
    void deveCalcularPagamentoCartaoComNovaTaxaDaConfiguracao() {
        ConfiguracaoLoja.getInstance().setTaxaJurosCartao(0.10f);
        EstrategiaPagamento pagamento = new PagamentoCartao();
        assertEquals(220.0f, pagamento.calcular(200.0f), 0.01f);
    }

    @Test
    void deveCalcularPagamentoBoleto() {
        EstrategiaPagamento pagamento = new PagamentoBoleto();
        assertEquals(203.5f, pagamento.calcular(200.0f), 0.01f);
    }

}