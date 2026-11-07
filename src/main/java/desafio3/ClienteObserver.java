package desafio3;

import java.util.Observable;
import java.util.Observer;

public class ClienteObserver implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public ClienteObserver(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void inscrever(Pedido pedido) {
        pedido.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        Pedido pedido = (Pedido) observable;
        this.ultimaNotificacao = this.nome + ", seu pedido " + pedido.getNumero() + " agora está " + pedido.getNomeEstado();
    }

}