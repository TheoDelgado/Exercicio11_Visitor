package padroescomportamentais.chainofresponsability.suporte;

public class AtendenteNivel1 extends Atendente {

    public AtendenteNivel1(Atendente superior) {
        listaChamados.add(TipoChamadoSenha.getTipoChamadoSenha());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Nível 1";
    }
}