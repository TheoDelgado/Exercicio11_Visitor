package desafio;

public abstract class Documento {

    protected CanalEntrega canalEntrega;

    public Documento(CanalEntrega canalEntrega) {
        this.canalEntrega = canalEntrega;
    }

    public void setCanalEntrega(CanalEntrega canalEntrega) {
        this.canalEntrega = canalEntrega;
    }

    public abstract String getConteudo();

    public String enviar() {
        return this.canalEntrega.enviar(this.getConteudo());
    }
}