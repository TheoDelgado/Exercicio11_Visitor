package padroescomportamentais.mediator.atendimento;

public class Logistica implements Setor {

    private static Logistica instancia = new Logistica();

    private Logistica() {}

    public static Logistica getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Logística vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Logística agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Logística vai analisar a sugestão: " + mensagem;
    }
}