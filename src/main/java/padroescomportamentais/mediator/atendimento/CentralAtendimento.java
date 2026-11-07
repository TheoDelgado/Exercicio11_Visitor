package padroescomportamentais.mediator.atendimento;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String receberElogioLogistica(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "A Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoLogistica(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "A Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoLogistica(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "A Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberSugestao(mensagem);
    }

}