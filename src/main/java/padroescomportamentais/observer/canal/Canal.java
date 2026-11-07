package padroescomportamentais.observer.canal;

import java.util.Observable;

public class Canal extends Observable {

    private String nomeCanal;
    private String categoria;

    public Canal(String nomeCanal, String categoria) {
        this.nomeCanal = nomeCanal;
        this.categoria = categoria;
    }

    public void publicarVideo() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Canal{" +
                "nomeCanal='" + nomeCanal + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}