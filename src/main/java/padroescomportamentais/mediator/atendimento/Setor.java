package padroescomportamentais.mediator.atendimento;

public interface Setor {
    String receberReclamacao(String mensagem);
    String receberElogio(String mensagem);
    String receberSugestao(String mensagem);
}