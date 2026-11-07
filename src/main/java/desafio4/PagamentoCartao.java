package desafio4;

public class PagamentoCartao implements EstrategiaPagamento {

    public float calcular(float valor) {
        return valor * (1 + ConfiguracaoLoja.getInstance().getTaxaJurosCartao());
    }
}