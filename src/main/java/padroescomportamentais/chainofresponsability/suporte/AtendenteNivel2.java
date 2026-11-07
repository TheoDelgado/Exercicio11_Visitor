package padroescomportamentais.chainofresponsability.suporte;

public class AtendenteNivel2 extends Atendente {

    public AtendenteNivel2(Atendente superior) {
        listaChamados.add(TipoChamadoRede.getTipoChamadoRede());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Nível 2";
    }
}