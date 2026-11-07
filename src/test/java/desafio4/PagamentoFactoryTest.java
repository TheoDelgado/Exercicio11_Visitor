package desafio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {

    @Test
    void deveRetornarPagamentoPix() {
        assertTrue(PagamentoFactory.obterEstrategia("Pix") instanceof PagamentoPix);
    }

    @Test
    void deveRetornarPagamentoCartao() {
        assertTrue(PagamentoFactory.obterEstrategia("Cartao") instanceof PagamentoCartao);
    }

    @Test
    void deveRetornarPagamentoBoleto() {
        assertTrue(PagamentoFactory.obterEstrategia("Boleto") instanceof PagamentoBoleto);
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        try {
            PagamentoFactory.obterEstrategia("Dinheiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {
        try {
            PagamentoFactory.obterEstrategia("Cheque");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inválido", e.getMessage());
        }
    }

}