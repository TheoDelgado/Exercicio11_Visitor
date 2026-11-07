package desafio3;

import java.util.Observable;
import java.util.Observer;

public class EstoqueObserver implements Observer {

    private String ultimaNotificacao;

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void inscrever(Pedido pedido) {
        pedido.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        Pedido pedido = (Pedido) observable;
        this.ultimaNotificacao = "Estoque notificado: pedido " + pedido.getNumero() + " mudou para " + pedido.getNomeEstado();
    }

}