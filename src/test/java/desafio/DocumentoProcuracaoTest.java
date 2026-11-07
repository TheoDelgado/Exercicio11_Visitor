package desafio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoProcuracaoTest {

    @Test
    void deveEnviarProcuracaoPFPorEmail() {
        Procuracao procuracao = new ProcuracaoPF();
        Documento documento = new DocumentoProcuracao(procuracao, new CanalEmail());
        assertEquals("Procuração de Pessoa Física enviado por E-mail", documento.enviar());
    }

    @Test
    void deveEnviarProcuracaoPJPelosCorreios() {
        Procuracao procuracao = new ProcuracaoPJ();
        Documento documento = new DocumentoProcuracao(procuracao, new CanalCorreios());
        assertEquals("Procuração de Pessoa Jurídica enviado pelos Correios", documento.enviar());
    }

}