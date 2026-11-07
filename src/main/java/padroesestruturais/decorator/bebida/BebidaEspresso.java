package padroesestruturais.decorator.bebida;

public class BebidaEspresso implements Bebida {

    public float preco;

    public BebidaEspresso() {
    }

    public BebidaEspresso(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Espresso";
    }

}