package desafio;

public class Cliente {

    private FabricaAbstrata fabrica;
    private Contrato contrato;
    private Procuracao procuracao;

    public Cliente(String tipo) {
        this.fabrica = FactoryMethod.getInstance().obterFabrica(tipo);
        this.contrato = this.fabrica.createContrato();
        this.procuracao = this.fabrica.createProcuracao();
    }

    public String getContrato() {
        return this.contrato.gerarContrato();
    }

    public String getProcuracao() {
        return this.procuracao.gerarProcuracao();
    }

    public String enviarContrato(CanalEntrega canalEntrega) {
        Documento documento = new DocumentoContrato(this.contrato, canalEntrega);
        return documento.enviar();
    }

    public String enviarProcuracao(CanalEntrega canalEntrega) {
        Documento documento = new DocumentoProcuracao(this.procuracao, canalEntrega);
        return documento.enviar();
    }
}