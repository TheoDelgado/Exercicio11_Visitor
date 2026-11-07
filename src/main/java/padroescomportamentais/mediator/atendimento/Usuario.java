package padroescomportamentais.mediator.atendimento;

public class Usuario {

    public String elogiarLogistica(String mensagem) {
        return CentralAtendimento.getInstancia().receberElogioLogistica(mensagem);
    }

    public String reclamarLogistica(String mensagem) {
        return CentralAtendimento.getInstancia().receberReclamacaoLogistica(mensagem);
    }

    public String sugerirLogistica(String mensagem) {
        return CentralAtendimento.getInstancia().receberSugestaoLogistica(mensagem);
    }


}