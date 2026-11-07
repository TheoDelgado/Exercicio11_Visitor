package padroesestruturais.bridge.lavagem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LavagemSimplesTest {

    @Test
    void deveRetornarCustoLavagemSimplesComHatch() {
        TipoVeiculo tipoVeiculo = new Hatch();
        LavagemSimples lavagemSimples = new LavagemSimples(50.0f);
        lavagemSimples.setTipoVeiculo(tipoVeiculo);
        assertEquals(50.0f, lavagemSimples.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoLavagemSimplesComSedan() {
        TipoVeiculo tipoVeiculo = new Sedan();
        LavagemSimples lavagemSimples = new LavagemSimples(50.0f);
        lavagemSimples.setTipoVeiculo(tipoVeiculo);
        assertEquals(50.0f, lavagemSimples.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoLavagemSimplesComSuv() {
        TipoVeiculo tipoVeiculo = new Suv();
        LavagemSimples lavagemSimples = new LavagemSimples(50.0f);
        lavagemSimples.setTipoVeiculo(tipoVeiculo);
        assertEquals(50.0f, lavagemSimples.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoLavagemSimplesComCaminhonete() {
        TipoVeiculo tipoVeiculo = new Caminhonete();
        LavagemSimples lavagemSimples = new LavagemSimples(50.0f);
        lavagemSimples.setTipoVeiculo(tipoVeiculo);
        assertEquals(50.0f, lavagemSimples.calcularCusto(), 0.01f);
    }

}