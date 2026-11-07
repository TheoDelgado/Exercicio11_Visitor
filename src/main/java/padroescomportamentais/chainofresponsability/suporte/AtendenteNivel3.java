package padroescomportamentais.chainofresponsability.suporte;

public class AtendenteNivel3 extends Atendente {

    public AtendenteNivel3(Atendente superior) {
        listaChamados.add(TipoChamadoServidor.getTipoChamadoServidor());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Nível 3";
    }

}