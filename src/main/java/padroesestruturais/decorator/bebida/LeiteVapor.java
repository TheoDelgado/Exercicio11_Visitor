package padroesestruturais.decorator.bebida;

public class LeiteVapor extends BebidaDecorator {

    public LeiteVapor(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Leite Vaporizado";
    }
}