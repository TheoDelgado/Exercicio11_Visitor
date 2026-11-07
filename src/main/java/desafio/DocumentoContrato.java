package desafio;

public class DocumentoContrato extends Documento {

    private Contrato contrato;

    public DocumentoContrato(Contrato contrato, CanalEntrega canalEntrega) {
        super(canalEntrega);
        this.contrato = contrato;
    }

    public String getConteudo() {
        return this.contrato.gerarContrato();
    }
}