package padroesestruturais.decorator.bebida;

public class XaropeCaramelo extends BebidaDecorator {

    public XaropeCaramelo(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeAdicional() {
        return "Xarope de Caramelo";
    }
}