package padroescriacao.factorymethod.notificacao;

public class NotificacaoEmail implements INotificacao {

    public String enviar() {
        return "E-mail enviado";
    }

    public String cancelar() {
        return "E-mail cancelado";
    }
}