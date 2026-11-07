package padroescriacao.factorymethod.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoEmailTest {

    @Test
    void deveEnviarEmail() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("E-mail enviado", notificacao.enviar());
    }

    @Test
    void deveCancelarEmail() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("E-mail cancelado", notificacao.cancelar());
    }

}