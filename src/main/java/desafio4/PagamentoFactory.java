package desafio4;

public class PagamentoFactory {

    public static EstrategiaPagamento obterEstrategia(String pagamento) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("desafio4.Pagamento" + pagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Pagamento inexistente");
        }
        if (!(objeto instanceof EstrategiaPagamento)) {
            throw new IllegalArgumentException("Pagamento inválido");
        }
        return (EstrategiaPagamento) objeto;
    }
}