package desafio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarContratoPF() {
        Cliente cliente = new Cliente("PF");
        assertEquals("Contrato de Pessoa Física", cliente.getContrato());
    }

    @Test
    void deveRetornarProcuracaoPF() {
        Cliente cliente = new Cliente("PF");
        assertEquals("Procuração de Pessoa Física", cliente.getProcuracao());
    }

    @Test
    void deveRetornarContratoPJ() {
        Cliente cliente = new Cliente("PJ");
        assertEquals("Contrato de Pessoa Jurídica", cliente.getContrato());
    }

    @Test
    void deveRetornarProcuracaoPJ() {
        Cliente cliente = new Cliente("PJ");
        assertEquals("Procuração de Pessoa Jurídica", cliente.getProcuracao());
    }

    @Test
    void deveEnviarContratoDoClientePorEmail() {
        Cliente cliente = new Cliente("PF");
        assertEquals("Contrato de Pessoa Física enviado por E-mail", cliente.enviarContrato(new CanalEmail()));
    }

    @Test
    void deveEnviarProcuracaoDoClientePelosCorreios() {
        Cliente cliente = new Cliente("PJ");
        assertEquals("Procuração de Pessoa Jurídica enviado pelos Correios", cliente.enviarProcuracao(new CanalCorreios()));
    }

}