package desafio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaPFTest {

    @Test
    void deveCriarContratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        assertEquals("Contrato de Pessoa Física", fabrica.createContrato().gerarContrato());
    }

    @Test
    void deveCriarProcuracaoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        assertEquals("Procuração de Pessoa Física", fabrica.createProcuracao().gerarProcuracao());
    }

}