package padroescriacao.factorymethod.notificacao;

public class NotificacaoPush implements INotificacao {

    public String enviar() {
        return "Notificação push enviada";
    }

    public String cancelar() {
        return "Notificação push cancelada";
    }
}