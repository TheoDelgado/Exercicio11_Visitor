package padroesestruturais.bridge.lavagem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnceramentoTest {

    @Test
    void deveRetornarCustoEnceramentoComHatch() {
        TipoVeiculo tipoVeiculo = new Hatch();
        Enceramento enceramento = new Enceramento(20.0f);
        enceramento.setTipoVeiculo(tipoVeiculo);
        enceramento.setNumCamadas(2);
        assertEquals(40.0f, enceramento.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoEnceramentoComSedan() {
        TipoVeiculo tipoVeiculo = new Sedan();
        Enceramento enceramento = new Enceramento(20.0f);
        enceramento.setTipoVeiculo(tipoVeiculo);
        enceramento.setNumCamadas(2);
        assertEquals(44.0f, enceramento.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoEnceramentoComSuv() {
        TipoVeiculo tipoVeiculo = new Suv();
        Enceramento enceramento = new Enceramento(20.0f);
        enceramento.setTipoVeiculo(tipoVeiculo);
        enceramento.setNumCamadas(2);
        assertEquals(48.0f, enceramento.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoEnceramentoComCaminhonete() {
        TipoVeiculo tipoVeiculo = new Caminhonete();
        Enceramento enceramento = new Enceramento(20.0f);
        enceramento.setTipoVeiculo(tipoVeiculo);
        enceramento.setNumCamadas(2);
        assertEquals(52.0f, enceramento.calcularCusto(), 0.01f);
    }

}