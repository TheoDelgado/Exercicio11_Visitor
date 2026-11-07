package padroesestruturais.decorator.bebida;

public abstract class BebidaDecorator implements Bebida {

    private Bebida bebida;
    public String estrutura;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.bebida.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeAdicional();

    public String getDescricao() {
        return this.bebida.getDescricao() + "/" + this.getNomeAdicional();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}