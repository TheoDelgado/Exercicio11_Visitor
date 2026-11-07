package padroescomportamentais.mediator.atendimento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\nA Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Logística agradece a mensagem: Entrega rápida",
                cliente.elogiarLogistica("Entrega rápida"));
    }

    @Test
    void deveReclamarLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\nA Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Logística vai procurar melhorar o serviço da reclamação: Atraso na entrega",
                cliente.reclamarLogistica("Atraso na entrega"));
    }

    @Test
    void deveSugerirLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Atendimento agradece seu contato.\nA Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Logística vai analisar a sugestão: Rastreamento em tempo real",
                cliente.sugerirLogistica("Rastreamento em tempo real"));
    }

}