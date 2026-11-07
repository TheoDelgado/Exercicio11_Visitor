package desafio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaPJTest {

    @Test
    void deveCriarContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        assertEquals("Contrato de Pessoa Jurídica", fabrica.createContrato().gerarContrato());
    }

    @Test
    void deveCriarProcuracaoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        assertEquals("Procuração de Pessoa Jurídica", fabrica.createProcuracao().gerarProcuracao());
    }

}