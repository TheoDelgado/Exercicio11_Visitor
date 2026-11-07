package desafio4;

public class PagamentoBoleto implements EstrategiaPagamento {

    public float calcular(float valor) {
        return valor + ConfiguracaoLoja.getInstance().getTaxaBoleto();
    }
}