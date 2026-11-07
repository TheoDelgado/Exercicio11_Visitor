package padroescriacao.factorymethod.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaNotificacaoInexistente() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("Telegram");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Notificação inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNotificacaoInvalida() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("Whatsapp");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Notificação inválida", e.getMessage());
        }
    }
}