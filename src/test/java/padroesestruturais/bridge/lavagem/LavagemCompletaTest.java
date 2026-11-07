package padroesestruturais.bridge.lavagem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LavagemCompletaTest {

    @Test
    void deveRetornarCustoLavagemCompletaComHatch() {
        TipoVeiculo tipoVeiculo = new Hatch();
        LavagemCompleta lavagemCompleta = new LavagemCompleta(100.0f);
        lavagemCompleta.setTipoVeiculo(tipoVeiculo);
        assertEquals(100.0f, lavagemCompleta.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoLavagemCompletaComSedan() {
        TipoVeiculo tipoVeiculo = new Sedan();
        LavagemCompleta lavagemCompleta = new LavagemCompleta(100.0f);
        lavagemCompleta.setTipoVeiculo(tipoVeiculo);
        assertEquals(110.0f, lavagemCompleta.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoLavagemCompletaComSuv() {
        TipoVeiculo tipoVeiculo = new Suv();
        LavagemCompleta lavagemCompleta = new LavagemCompleta(100.0f);
        lavagemCompleta.setTipoVeiculo(tipoVeiculo);
        assertEquals(120.0f, lavagemCompleta.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoLavagemCompletaComCaminhonete() {
        TipoVeiculo tipoVeiculo = new Caminhonete();
        LavagemCompleta lavagemCompleta = new LavagemCompleta(100.0f);
        lavagemCompleta.setTipoVeiculo(tipoVeiculo);
        assertEquals(130.0f, lavagemCompleta.calcularCusto(), 0.01f);
    }

}