package desafio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoLojaTest {

    @Test
    void deveRetornarMesmaInstancia() {
        assertSame(ConfiguracaoLoja.getInstance(), ConfiguracaoLoja.getInstance());
    }

    @Test
    void deveRetornarTaxaJurosCartao() {
        ConfiguracaoLoja.getInstance().setTaxaJurosCartao(0.08f);
        assertEquals(0.08f, ConfiguracaoLoja.getInstance().getTaxaJurosCartao(), 0.0001f);
    }

    @Test
    void deveRetornarTaxaBoleto() {
        ConfiguracaoLoja.getInstance().setTaxaBoleto(4.0f);
        assertEquals(4.0f, ConfiguracaoLoja.getInstance().getTaxaBoleto(), 0.0001f);
    }

}