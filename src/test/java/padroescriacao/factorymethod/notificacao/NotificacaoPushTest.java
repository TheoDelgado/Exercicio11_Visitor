package padroescriacao.factorymethod.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoPushTest {

    @Test
    void deveEnviarPush() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Push");
        assertEquals("Notificação push enviada", notificacao.enviar());
    }

    @Test
    void deveCancelarPush() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Push");
        assertEquals("Notificação push cancelada", notificacao.cancelar());
    }

}