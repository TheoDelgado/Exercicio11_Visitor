package padroescriacao.singleton.tema;

public class ConfiguracaoTema {

    private ConfiguracaoTema() {};
    private static ConfiguracaoTema instance = new ConfiguracaoTema();
    public static ConfiguracaoTema getInstance() {
        return instance;
    }

    private String temaAtual;
    private String corDestaque;

    public String getTemaAtual() {
        return temaAtual;
    }

    public void setTemaAtual(String temaAtual) {
        this.temaAtual = temaAtual;
    }

    public String getCorDestaque() {
        return corDestaque;
    }

    public void setCorDestaque(String corDestaque) {
        this.corDestaque = corDestaque;
    }
}