package desafio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoContratoTest {

    @Test
    void deveEnviarContratoPFPorEmail() {
        Contrato contrato = new ContratoPF();
        Documento documento = new DocumentoContrato(contrato, new CanalEmail());
        assertEquals("Contrato de Pessoa Física enviado por E-mail", documento.enviar());
    }

    @Test
    void deveEnviarContratoPJPelosCorreios() {
        Contrato contrato = new ContratoPJ();
        Documento documento = new DocumentoContrato(contrato, new CanalCorreios());
        assertEquals("Contrato de Pessoa Jurídica enviado pelos Correios", documento.enviar());
    }

}