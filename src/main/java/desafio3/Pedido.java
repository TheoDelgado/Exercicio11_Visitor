package desafio3;

import java.util.Observable;

public class Pedido extends Observable {

    private String numero;
    private PedidoEstado estado;

    public Pedido(String numero) {
        this.numero = numero;
        this.estado = PedidoEstadoNovo.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public boolean pagar() {
        return estado.pagar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNumero() {
        return numero;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

}