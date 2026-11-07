package padroescriacao.factorymethod.notificacao;

public class NotificacaoSms implements INotificacao {

    public String enviar() {
        return "SMS enviado";
    }

    public String cancelar() {
        return "SMS cancelado";
    }
}