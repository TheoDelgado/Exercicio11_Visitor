package desafio4;

public class PagamentoPix implements EstrategiaPagamento {

    public float calcular(float valor) {
        return valor * 0.95f;
    }
}