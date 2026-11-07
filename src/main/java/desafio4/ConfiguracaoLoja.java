package desafio4;

public class ConfiguracaoLoja {

    private ConfiguracaoLoja() {};
    private static ConfiguracaoLoja instance = new ConfiguracaoLoja();
    public static ConfiguracaoLoja getInstance() {
        return instance;
    }

    private float taxaJurosCartao = 0.05f;
    private float taxaBoleto = 3.5f;

    public float getTaxaJurosCartao() {
        return taxaJurosCartao;
    }

    public void setTaxaJurosCartao(float taxaJurosCartao) {
        this.taxaJurosCartao = taxaJurosCartao;
    }

    public float getTaxaBoleto() {
        return taxaBoleto;
    }

    public void setTaxaBoleto(float taxaBoleto) {
        this.taxaBoleto = taxaBoleto;
    }
}