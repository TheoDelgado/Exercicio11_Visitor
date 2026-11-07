package padroescomportamentais.chainofresponsability.suporte;

public class AtendenteEspecialista extends Atendente {

    public AtendenteEspecialista(Atendente superior) {
        listaChamados.add(TipoChamadoSeguranca.getTipoChamadoSeguranca());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Especialista";
    }

}