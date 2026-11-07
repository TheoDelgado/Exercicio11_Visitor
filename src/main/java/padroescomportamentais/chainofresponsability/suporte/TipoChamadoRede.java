package padroescomportamentais.chainofresponsability.suporte;

public class TipoChamadoRede implements TipoChamado {

    private static TipoChamadoRede tipoChamadoRede = new TipoChamadoRede();

    private TipoChamadoRede() {};

    public static TipoChamadoRede getTipoChamadoRede() {
        return tipoChamadoRede;
    }
}