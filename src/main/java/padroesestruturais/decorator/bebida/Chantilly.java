package padroesestruturais.decorator.bebida;

public class Chantilly extends BebidaDecorator {

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeAdicional() {
        return "Chantilly";
    }
}