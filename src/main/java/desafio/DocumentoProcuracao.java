package desafio;

public class DocumentoProcuracao extends Documento {

    private Procuracao procuracao;

    public DocumentoProcuracao(Procuracao procuracao, CanalEntrega canalEntrega) {
        super(canalEntrega);
        this.procuracao = procuracao;
    }

    public String getConteudo() {
        return this.procuracao.gerarProcuracao();
    }
}