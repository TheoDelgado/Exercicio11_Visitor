package padroescriacao.factorymethod.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSmsTest {

    @Test
    void deveEnviarSms() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Sms");
        assertEquals("SMS enviado", notificacao.enviar());
    }

    @Test
    void deveCancelarSms() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Sms");
        assertEquals("SMS cancelado", notificacao.cancelar());
    }

}